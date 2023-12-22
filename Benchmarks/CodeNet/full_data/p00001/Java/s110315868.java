import java.util.Scanner;
public class TopHills {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] tops = {0,0,0};
		for (int i = 0;i < 10;i++) {
			int h = scan.nextInt();
			// do nothing if equality
			if (h > tops[0]) {
				tops[2]=tops[1];
				tops[1]=tops[0];
				tops[0] = h;
			} else if (h < tops[0] && h > tops[1]) {
				tops[2]=tops[1];
				tops[1] = h;
			} else if (h < tops[1] && h > tops[2]) {
				tops[2]=h;
			}
		}
		System.out.print(tops[0]);
		System.out.print("\n");
		System.out.print(tops[1]);
		System.out.print("\n");
		System.out.print(tops[2]);
		System.out.print("\n");
	}
}