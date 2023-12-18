import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {


//	final int MOD = 1000000007;

	public static int min = 3000000;

	public static int[] a = {1, 2};

	public static void main(String[] args) {

		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int n = sc.nextInt();
		long k = sc.nextLong();



		int[] a = new int[n];
		int[] visit = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

//		String s = sc.next();

//		int[] ans = new int[n];

//		ArrayList<Integer> list = new ArrayList<>();

		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		ArrayList<Integer> move = new ArrayList<Integer>();
		ArrayList<Integer> roop = new ArrayList<Integer>();

		//-------------------------------------------------------------------------------------

		int pos = 0;
		while(visit[pos] != 2) {
			if(visit[pos] == 0) {
				move.add(pos);
			} else {
				roop.add(pos);
			}
			visit[pos]++;
			pos = a[pos] - 1;
		}

		if(move.size() > k) {
			System.out.println(k + 1);
		} else {
			long tmp = move.size() - roop.size();
			tmp = k - (long) tmp;
			tmp = tmp % roop.size();
			int index = (int) tmp;
			System.out.println(roop.get(index) + 1);
		}
		//-------------------------------------------------------------------------------------

//		for(int i = 0; i < n; i++) {
//			System.out.println(ans[i]);
//		}

//		if(!f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

//		System.out.println(ans);

		sc.close();
	}



}