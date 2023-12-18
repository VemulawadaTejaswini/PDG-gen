import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int[] suretuP = new int[N];
		int[] suretuQ = new int[N];

		ArrayList<Integer> integer1 = new ArrayList<>();
		ArrayList<Integer> integer2 = new ArrayList<>();

		for(int i=0;i<N;i++) {

			suretuP[i] = scan.nextInt();
			suretuQ[i] = scan.nextInt();
		}

		for(int i=1;i<=N;i++) {
			integer1.add(i);
		}

		int countP = 0;

		for(int i=0;i<N-1;i++) {
			countP += integer1.indexOf(suretuP[i])*fact(N-i-1);
			integer1.remove((Integer)suretuP[i]);
			Collections.sort(integer1);
		}

		int countQ = 0;

		for(int i=0;i<N-1;i++) {
			countQ += integer2.indexOf(suretuQ[i])*fact(N-i-1);
			integer2.remove((Integer)suretuQ[i]);
			Collections.sort(integer2);
		}

		System.out.println(Math.abs(countP-countQ));
		scan.close();

	}

	public static int fact(int num) {

		int i=1;
		for(int j=1;j<=num;j++) {
			i *= j;
		}
		return i;
	}

}
