import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main{
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;
		//PrintStream out = new PrintStream("src/output.txt");

		//System.setOut(out);

		sc = new Scanner(in);

		int N = sc.nextInt();
		int[] a = new int[N];
		int answer = 0;

		for(int i = 0; i < N; i++){
			a[i] = sc.nextInt();
		}

		for(int i = 0; i < N; i++){
			if(a[a[i]-1] == i+1){
				answer++;
			}
		}

		System.out.println(answer/2);

		//out.close();
	}
}