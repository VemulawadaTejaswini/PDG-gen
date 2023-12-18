import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int[] kids = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(kids);
		Main main = new Main();

		System.out.println(main.solve(line[0],line[1],kids));
	}

	public int solve(int N,int x,int[] kids) {
		int con =0;
		int ind =0;
		while (true) {
			if (x - kids[ind] < 0) {
				break;
			}else {
				x = x - kids[ind];
				con++;
			}
			ind++;
			if (ind == N) {
				if (x > 0) {
					con--;
				}
				break;
			}
		}
		return con;
	}
}