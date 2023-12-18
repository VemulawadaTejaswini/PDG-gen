import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int goukei=0;
		for(int i=1;i<n;i++){
			goukei+=i;
		}
		System.out.println(goukei);
	}
}
