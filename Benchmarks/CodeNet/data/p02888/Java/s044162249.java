import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		List<Integer> L = new ArrayList<Integer>();
		for(int i = 0;i < N;i++) {
			L.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		long sum = 0;
		L.sort(Comparator.reverseOrder());

		for(int i = 0;i < N-2;i++) {
			for(int j =i+1;j < N-1;j++){
				for(int k = j+1;k < N;k++) {
					if(L.get(i) <  L.get(j) + L.get(k)) {
						sum++;
					}else {
						break;
					}
				}
			}
		}
		System.out.println(sum);
	}
}