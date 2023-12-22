import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int point_num = sc.nextInt();
		int dis = sc.nextInt();
		ArrayList<String> ar = new ArrayList<>();
		int ans = 0;
		String v = sc.nextLine();

		int count = 0;
		while(count < point_num) {
			ar.add(sc.nextLine());
			count++;
		}



		for(String b : ar) {
			String bb[] = b.split(" ");
			int x = Integer.parseInt(bb[0]);
			int y = Integer.parseInt(bb[1]);

			double dist = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

			if (dist <= dis) {
				ans++;
			}
		}

		System.out.println(ans);


//		Scanner sc = new Scanner(System.in);
//
//		int num = sc.nextInt();
//		int cut_num = sc.nextInt();
//		String v = sc.nextLine();
//		String l = sc.nextLine();
//		String len[] = l.split(" ");
//		ArrayList<String> ar = new ArrayList<>();
//		ArrayList<Double> ar2 = new ArrayList<>();
//
//		long ans = Long.MAX_VALUE;
//
//		for (int j = 0; j<1000; j++) {
//
//			for (int i = 0; i<len.length; i++) {
//				ar2.add((double)Integer.parseInt(len[i]));
//			}
//
//			long ret = cut(num, cut_num, ar2);
//
//			if (ans > ret) {
//				ans = ret;
//			}
//		}
//
//		System.out.println(ans);
//
//		}
//
//	static ArrayList<Double> sort(ArrayList<Double> ar2){
//		Collections.sort(ar2);
//		Collections.reverse(ar2);
//
//		return ar2;
//	}
//
//
//	static long cut(int num, int cut_num, ArrayList<Double> ar2) {
//		Random r = new Random();
//
//		for (int i=0; i<cut_num; i++) {
//
//			sort(ar2);
//			double result = ar2.get(0) / r.nextGaussian() * ar2.get(0);
//			ar2.set(0, result);
//
//		}
//
//		sort(ar2);
//
//		return Math.round(ar2.get(0));
	}

}
