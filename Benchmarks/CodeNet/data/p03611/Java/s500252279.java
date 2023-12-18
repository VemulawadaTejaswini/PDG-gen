import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int a[] = new int[N];
		HashSet<Integer>opeNumSet = new HashSet<Integer>();

		for (int i=0; i<N; i++){
			a[i] = sc.nextInt();
			opeNumSet.add(a[i] - 1);
			opeNumSet.add(a[i]);
			opeNumSet.add(a[i] + 1);
		}
		int maxTogether = 0;
		for (Iterator<Integer> it = opeNumSet.iterator(); it.hasNext();){
			int opeNum = it.next();
			int together = 0;
			for (int i=0; i<N; i++){
				if (Math.abs(a[i] - opeNum) <= 1){
					together++;
				}
			}
			maxTogether = Math.max(maxTogether, together);
		}
		System.out.println(maxTogether);
	}
}


