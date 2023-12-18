import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> P = new ArrayList<Integer>();
		long sum = 0;
		for(int i = 0;i < N;i++) {
			P.add(sc.nextInt());
		}
		for(int i = 0;i < N-1;i++) {
			for(int j = i+1;j < N;j++) {
				List<Integer> subP =  P.subList(i, j+1);
				subP.sort(Comparator.reverseOrder());
				sum += subP.get(1);
			}
		}
		sc.close();
		System.out.println(sum);
	}
}