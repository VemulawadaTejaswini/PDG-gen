import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	int time = 0;
	int temp = 0;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] c = new int[N-1];
		int[] s = new int[N-1];
		int[] f = new int[N-1];
		for(int i = 0; i < N-1; i++) {
			c[i] = sc.nextInt();
			s[i] = sc.nextInt();
			f[i] = sc.nextInt();
		}
		for(int i = 0; i < N-1; i++) {
			time = s[i] + c[i]; 
			for(int j = i+1; j < N-1; j++) {
				if(time < s[j]) time = s[j]+c[j];
				else{
					temp = time % f[j];
					if(temp != 0) time += f[j] - temp + c[j];
					else time += c[j];
				}
			}
			System.out.println(time);
			time = 0;
		}
		System.out.println(0);
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}