import java.util.Scanner;
public class Test {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.printf("%d %d %6f",a/b,a%b,(double)a/b);
	}
		
	}