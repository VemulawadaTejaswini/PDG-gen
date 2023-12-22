import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] NM = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] Hs = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		boolean[] Gs = new boolean[NM[0]];
		for(int i = 0; i < NM[0]; i++) Gs[i] = true;
		for(int i = 0; i < NM[1]; i++) {
			int[] AB = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int A = AB[0] - 1;
			int B = AB[1] - 1;
			if(Hs[A] == Hs[B]) {
				Gs[B] = Gs[A] = false;
			}
			else if(Hs[A] > Hs[B]) {
				Gs[B] = false;
			} else {
				Gs[A] = false;
			}
		}
		int count = 0;
		for(int i= 0; i< NM[0]; i++) {
			if(Gs[i]) count++;
		}
		System.out.println(count);
	}
}
