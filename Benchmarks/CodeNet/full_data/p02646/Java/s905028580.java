import java.util.Scanner;
import java.lang.*;

public class Main{
 
	public static void main(String args[]){

    	//入力するためのオブジェクトを生成
      	Scanner scan = new Scanner(System.in);
	int A = scan.nextInt();	//Aのいる座標
	int B = scan.nextInt(); //Bがいる座標
	int T = scan.nextInt(); //秒数
	int V = scan.nextInt();	//Aの秒速
	int W = scan.nextInt();	//Bの秒速

	//AとBの位置関係
	if(A<=B){
	   if(A *V * T <= B * W * T ){
	      System.out.println("Yes");
	   }else{
	      System.out.println("No");

	   }
	}else{
	   int B2 = -(B * T);
	   int A2 = -(A * T);
             if(A2 *V * T >= B * W * T ){
	   	System.out.println("Yes");
	      }else{
	   	 System.out.println("No");

	      }
	}
   }
}