import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
       //値の取得
	   int N = sc.nextInt();
      //高橋君の位置
       int i = 1;
       int j = 1;
       int a = 1;
      
      //最終的な位置
      while(a<=N/a){
        if(N%a==0){
          i = a;
          j = N/i;
        }
        a++;
      }
      
      System.out.println(i+j-2);
    }
}