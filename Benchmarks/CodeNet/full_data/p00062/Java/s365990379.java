import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/xxxyyyy/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/xxxyyyy/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next();
			int array[] = new int[10];
			for(int i = 0; i < 10; i++)
			{
				array[i] = s.charAt(i) - '0';
			}
			for(int row = 1; row < 10; row++) {
				int next[] = new int[10];
				for(int i = 0; i < 10 - row; i++)
				{
					next[i] = (array[i] + array[i + 1]) % 10;
				}
				array = next;
			}
			System.out.println(array[0]);
		}
	}
	
	void debug(Object... os) {
		System.err.println(deepToString(os));
	}
}