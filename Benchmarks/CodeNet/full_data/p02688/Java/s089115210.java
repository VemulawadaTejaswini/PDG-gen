import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] sunuke = new int [n];
		Arrays.fill(sunuke, 0);
		for (int i = 0;i < k; ++i){
			int d = scan.nextInt();
			for (int j = 0;j < d; ++j){
				int a = scan.nextInt();
				++sunuke[a-1];
			}
		}

		int ans = 0;
		for (int i :sunuke){
			if (i == 0)ans++;
		}
		System.out.print(ans);

	}
}

//end