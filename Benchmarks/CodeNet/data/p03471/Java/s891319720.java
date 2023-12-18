import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		List<int[]> ansList = new ArrayList<>();
		int[] ans = new int[3];
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= N-i; j++) {	
				int k = N - i - j;
				if (10000 * i + 5000 * j + 1000 * k == Y && i+j+k == N) {
					ans[0] = i;
					ans[1] = j;
					ans[2] = k;
					ansList.add(ans);
				}				
			}	
		}
		if (ansList.isEmpty()) System.out.println("-1 " +  "-1 " + "-1");
		else {
			ans = ansList.get(0);
			System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);
		}
	}
}