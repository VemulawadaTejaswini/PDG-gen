import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==1)a=14;
		int b=sc.nextInt();
		if(b==1)b=14;
		if(a>b)System.out.println("Alice");
		else if(a<b)System.out.println("Bob");
		else System.out.println("Draw");
		
		}
		
	}
