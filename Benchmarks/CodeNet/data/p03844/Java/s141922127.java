import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		String s[] =sc.nextLine().split(" ");
		int a=Integer.parseInt(s[0]);
		int b=Integer.parseInt(s[2]);
		if(s[1].equals("+"))System.out.println(a+b);
		else System.out.println(a-b);
		
		
		
	}

	}
