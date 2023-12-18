import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] in = new int[2];
		for (int i = 0; i < 2; i++) in[i] = sc.nextInt();
	
		int tap = 1;
		while(in[1] > in[0]) {
			tap++;
			in[1] -= in[0];
		}
		
		System.out.println(tap);
	}
}
