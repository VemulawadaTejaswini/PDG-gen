import java.util.Arrays;
import java.util.Scanner;

//????????¢????±???????
public class Main {
	static Scanner sc = new Scanner(System.in);
	private static final int RECTANGLE = 4; //????????¢???????????°

	public static void main(String[] args) {
		while(sc.hasNext()) {
			int[] e = new int[RECTANGLE];

			for(int $ = 0; $ < RECTANGLE; $++) {
				e[$] = sc.nextInt();
			}

			String jugh = null;

			Arrays.sort(e);

			if((e[0] == e[1]) && (e[2] == e[3])) {
				jugh = "yes";
			} else {
				jugh = "no";
			}

			System.out.println(jugh);
		}

	}

}