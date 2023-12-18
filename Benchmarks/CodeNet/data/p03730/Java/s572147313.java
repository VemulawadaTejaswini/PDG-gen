import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); 
		int B = sc.nextInt(); 
		int C = sc.nextInt(); 
		int sw = 0;
		for(int i = 0; i < 1000; i++) {
			if(A*i%B == C) {
				System.out.println("YES");
				sw = 1;
				break;
			}
		}
		if(sw == 0)System.out.println("NO");
	}
}