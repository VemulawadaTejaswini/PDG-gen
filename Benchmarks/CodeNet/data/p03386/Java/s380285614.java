import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		int a = sc.nextInt();
      	int b = sc.nextInt();
      	int k = sc.nextInt();
      	int tasu =a;
      	//配列
        int num[] = new int[b-a+1];
        for(int i = 0; i < num.length; i++){
        	num[i] = a;
          	a++;
        }
      
      //重複しない場合
      if(num.length > 2*k){
      	for(int i = 0; i < k; i++){
          System.out.println(num[i]);
        }
        for(int i = 0; i < k; i++){
          System.out.println(num[num.length-k+i]);
        }
      }
        else if(a==b){
          System.out.println(a);
      }else {
       //重複する場合
        for(int i = 0; i < num.length; i++){
          System.out.println(num[i]);
        }
      }
     }
}