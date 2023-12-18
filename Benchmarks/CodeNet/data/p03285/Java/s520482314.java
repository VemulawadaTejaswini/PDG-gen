import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		boolean flag=false;
		for(int i=0;i<=25;i++) {
			for(int j=0;j<=14;j++) {
				int a=7*j+i*4;
				if(N==a) {
					flag=true;
				}
			}
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}