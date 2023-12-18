import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> X = new ArrayList<>();
		for(int i=0; i<=N-1;i++) {
			X.add(sc.nextInt());
		}
		int A  = (N/2)-1;
		for(int j=0;j<=N-1;j++) {
			ArrayList<Integer> Y = new ArrayList<>();
			for(int g=0;g<=N-1;g++) {
				if(j!=g) {
					Y.add(X.get(g));
				}
			}
			Collections.sort(Y,Collections.reverseOrder());
			System.out.println(Y.get(A));
		}
	}
}