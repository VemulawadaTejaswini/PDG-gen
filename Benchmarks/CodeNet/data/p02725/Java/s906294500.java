import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //入力
      int lake = sc.nextInt();//1週の長さ
      int house = sc.nextInt();//周りの家の数
      
      //各家が何メートルおきに配置されているかリストの空箱用意
      List<Integer>m = new ArrayList<>();
      
      //リスト作成
      for(int i =0; i<house; i++){
        	m.add(sc.nextInt());
      }
      //0mからlist1番目の距離と湖1週の距離からlistの最大値を比較
      if(m.get(1) - m.get(0) > lake - m.get(m.size()-1)){
        	System.out.println(m.get(m.size()-1)-m.get(1));
      }
      else{
        	System.out.println(m.get(m.size()-1)-m.get(0));
      }
    }
}