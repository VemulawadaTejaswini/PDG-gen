import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		String S=sc.next();
		if(S.indexOf("-")+1==A+1 && S.length()==A+B+1) {
			System.out.println("Yes");
		}else System.out.println("No");
	}
}
