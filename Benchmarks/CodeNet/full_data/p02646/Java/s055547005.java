import java.util.Scanner;
import java.lang.*;

public class Main{
 
	public static void main(String args[]){

    	//入力するためのオブジェクトを生成
      	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	int n = scan.nextInt();

	//n秒後にAがBを追い越す、または同地点にいるか
	if(a * n >= b * n ){
	   System.out.println("Yes");
	}else{
	   System.out.println("No");

	}
   }
}