import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static Scanner sc;

	static String S;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;
		//PrintStream out = new PrintStream("src/output.txt");

		//System.setOut(out);

		sc = new Scanner(in);

		int N = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		int max = -1;

		for(int i = 0; i < N; i++){
			int key = sc.nextInt();
			int value = sc.nextInt();

			map.put(key, value);

			if(key > max){
				max = key;
			}

		}

		System.out.println(max + map.get(max));
	}
}