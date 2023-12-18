import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] ss = s.split(" ");
		int n = Integer.parseInt(ss[0]);
		int k = Integer.parseInt(ss[1]);
//		int[] a = new int[n];
//		for(int i = 0; i < n; i++)
//		{
//			a[i] = scanner.nextInt();
//		}
		List<Long> list = new ArrayList<Long>();
		for(int i = 0; i < n; i++)
		{
			list.add(scanner.nextLong());
		}
		Collections.sort(list);
		int cnt = 0;
		Boolean end = false;
		List<Long> rs = new ArrayList<Long>();
		if(list.get(0)<0){
			for(int i = 0; i < n; i++){
				for(int j = i+1; j < n; j++){
					rs.add(list.get(i)*list.get(j));
				}
			}
			Collections.sort(rs);
			System.out.println(rs.get(k-1));
		}else{
			for(int i = 0; i< n; i++){
				if(end)break;
				for(int j = i+1; j < n; j++){
					if(end)break;
					System.out.println((long)list.get(i)*list.get(j));
					if(cnt == k-1){
//						System.out.println((long)list.get(i)*list.get(j));
						end = true;
						break;
					}

				}
			}
		}
//
//		List<Long> tm = new ArrayList<Long>();
//		for(int i = 0; i<n; i++){
//			for(int j = i+1; j < n; j++){
//				tm.add((long)a[i]*a[j]);
////				System.out.println((long)a[i]*a[j]);
//			}
//		}
//		Collections.sort(tm);
//		System.out.println(tm.get(k-1));
	}

}
