import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int M = reader.nextInt();
		int ans = N;
		boolean[] grouped = new boolean[N];

//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < M; i++) {
			int x = reader.nextInt();
			int y = reader.nextInt();
			int z = reader.nextInt();
			if (!grouped[x-1] || !grouped[y-1]) {
				ans--;
				grouped[x-1] = true;
				grouped[y-1] = true;
			}
		}

		System.out.print(ans);




		reader.close();

	}

}
