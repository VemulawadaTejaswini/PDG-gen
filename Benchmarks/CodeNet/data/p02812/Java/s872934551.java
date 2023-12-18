import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //入力
      int N =sc.nextInt();//文字列の長さ
      String S =sc.next();//文字列  
      char[] T =S.toCharArray();
      int count = 0;
      
      //いくつABCが含まれているか
   	  for(int i =0; i<N; i++){
        if(T[i] =='A' && T[i+1] =='B' && T[i+2] =='C'){
       	  	count++;
        }	
      }
       //出力
      	System.out.println(count); 
    }
}