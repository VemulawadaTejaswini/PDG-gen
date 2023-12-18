import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        //消費税8%
		double t8 = sc.nextDouble();
        //消費税10%
		double t10 = sc.nextDouble();
      	//商品の値段
      	int pro = -1;
        //8%の場合の値段(仮)
      	int price = (int)(t8/0.08);
      	//計算用
      	ArrayList<Integer>tmp= new ArrayList<Integer>();
      	//8%の商品の値段を求めて保存しておく
      	while(true){
          tmp.add(price);
          price++;
          if(!(t8==(int)(price*0.08))){
             break;
          }
        }
      	//10%でも成り立つか確認する
      	for(int i = 0;i<tmp.size();i++){
          if(t10==(int)(0.1*tmp.get(i))){
            pro = tmp.get(i);
            break;
          }  
        }  
      	System.out.println(pro); 
	}
}