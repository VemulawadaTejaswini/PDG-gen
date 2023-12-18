import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;
		//PrintStream out = new PrintStream("src/output.txt");

		//System.setOut(out);

		sc = new Scanner(in);

		String answer = "YES";

		int N = sc.nextInt();
		//long[] D = new long[N];
		ArrayList<Long> D = new ArrayList<Long>();
		for(int i = 0; i < N; i++){
			D.add(sc.nextLong());
		}
		int M = sc.nextInt();
		//long[] T = new long[N];
		ArrayList<Long> T = new ArrayList<Long>();
		for(int i = 0; i < M; i++){
			T.add(sc.nextLong());
		}

		for(int i = 0; i < M; i++){
			//System.out.println(D);
			if(D.contains(T.get(i))){
				D.remove(T.get(i));
			}else{
				answer = "NO";
				break;
			}
		}

		System.out.println(answer);

		//out.close();
	}
}