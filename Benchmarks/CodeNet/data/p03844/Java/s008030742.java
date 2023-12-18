import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		String s = sc.next();
		int b=sc.nextInt();
		if(s.equals("+")){
			System.out.println(a+b);
		}else if(s.equals("-")){
			System.out.println(a-b);
		}
	}
}
