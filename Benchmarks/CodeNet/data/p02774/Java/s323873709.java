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
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = scanner.nextInt();
		}

		List<Long> tm = new ArrayList<Long>();
		for(int i = 0; i<n; i++){
			for(int j = i+1; j < n; j++){
				tm.add((long)a[i]*a[j]);
//				System.out.println((long)a[i]*a[j]);
			}
		}
		Collections.sort(tm);
		System.out.println(tm.get(k-1));
	}

}
