import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj0025/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/xxxyyyy/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
		int[] a = new int[4], b = new int[4];
		for(int i = 0; i < 4; i++) a[i] = sc.nextInt();
		for(int i = 0; i < 4; i++) b[i] = sc.nextInt();
		int hit = 0, blow = 0;
			for (int i = 0; i < 4; i++) {
				if (a[i] == b[i])
					hit++;
				else {
					for(int j = 0; j < 4; j++) 
						if( i != j && b[i] == a[j] ) blow++;
										}
			}
			System.out.println(hit + " " + blow);
		}
	}

}