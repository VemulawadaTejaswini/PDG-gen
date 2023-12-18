import java.util.Scanner;

public class Main {
	static int N;
	static int[] L = new int[10];
	
	static int max = 0, sum = 0;
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String args[]) {
		Input();
		Findmax();
		Sumothers();
		Compare();
		
		return;
	}
	
	static void Input() {
		N = scanner.nextInt();
		for(int i=0; i<N; i++) {
			L[i] = scanner.nextInt();
		}
		return;
	}
	static void Findmax() {
		for(int i=0; i<N; i++) {
			if(max < L[i])max = L[i];
		}
		return;
	}
	static void Sumothers() {
		for(int i=0; i<N; i++) {
			sum += L[i];
		}
		sum -= max;
		return;
	}
	static void Compare() {
		if(max < sum)System.out.print("Yes");
		else System.out.print("No");
	}
	
}
