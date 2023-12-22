import java.util.Scanner;

public class Main{
     public static void main (String []args){
		Scanner stdin = new Scanner (System.in);
		int num1 = stdin.nextInt();
		int num2 = stdin.nextInt();
		if(num1<num2){
			System.out.println("a<b");
		}
		else if(num1>num2){
			System.out.println("a>b");
		}
		else{
			System.out.println("a==b");
		}
	}
}