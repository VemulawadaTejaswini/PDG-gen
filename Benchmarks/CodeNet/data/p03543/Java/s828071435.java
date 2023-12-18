import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int n1 = n%10;
		int n2 = (n/10)%10;
		int n3 = (n/100)%10;
		int n4 = (n/1000);
		if(n1==n2 && n2==n3){
			System.out.println("Yes");
			return;
		}
		else if(n2==n3 && n3==n4){
			System.out.println("Yes");
			return;
		}
		else{
			System.out.println("No");
		}
	}
}