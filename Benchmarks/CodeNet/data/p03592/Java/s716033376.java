import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main{
	static Scanner sc;

	static int N, M ,K;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;
		//PrintStream out = new PrintStream("src/output.txt");

		//System.setOut(out);

		sc = new Scanner(in);

		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();

		boolean answer = false;
		for(int i = 0; i < M; i++){
			for(int j = 0; j < N; j++){
				if(K == (M-i)*j + (N-j)*i){
					answer = true;
					break;
				}
			}
			if(answer == true){
				break;
			}
		}
		if(answer == true){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}