import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力
		int N = sc.nextInt();                
		int M = sc.nextInt();                
		
		ArrayList<ArrayList<Info>> list = new ArrayList<ArrayList<Info>>();
		for (int i = 0; i < N; i++) {
			list.add(new ArrayList<Info>());
		}
		for (int i = 0; i < M; i++) {
			int P = sc.nextInt();                
			int Y = sc.nextInt();
			Info info = new Info();
			info.index = i;
			info.prefecture = P;
			info.year = Y;
			list.get(P-1).add(info);
		}

		// 答えを出力
		String[] ans = new String[M];
		for (ArrayList<Info> inlist : list) {
			Collections.sort(inlist, new PrefectureComparator());
			for (int j = 0; j < inlist.size(); j++) {
				int p = inlist.get(j).prefecture;
				ans[inlist.get(j).index] = String.format("%06d", p)+String.format("%06d", j+1);
			}
		}
		for (int i = 0; i < M; i++) {
			System.out.println(ans[i]);
		}
	}
	
	public static class Info{
		int index = 0;
		int prefecture = 0;
		int year = 0;
		String number = "";
	}
	
	public static class PrefectureComparator implements Comparator<Info> {

		@Override
		public int compare(Info info1, Info info2) {
			return info1.year < info2.year ? -1 : 1;
		}
	}
}
