import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		List<Long> score = new ArrayList();
		for(int i=0; i<N; i++) {
			score.add(Long.parseLong(sc.next()));
		}
		long lastScore = 1;
		for(int i = K; i<score.size();i++) {
			if(lastScore ==1) {
				for(int j=i-1; j>(i-K-1);j--) {
					lastScore *= score.get(j);
				}
			}
			long thisScore = 1;
			for(int j=i; j>(i-K);j--) {
				thisScore *= score.get(j);
			}
			if(lastScore < thisScore) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			lastScore = thisScore;
		}

	}
}