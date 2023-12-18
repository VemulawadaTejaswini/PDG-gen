import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String flag = "No";
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(i*j == N)flag = "Yes";
			}
		}
		
		System.out.println(flag);
		
		sc.close();
	}
}