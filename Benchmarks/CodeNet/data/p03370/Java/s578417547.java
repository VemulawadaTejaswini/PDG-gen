import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner vd = new Scanner(System.in);
		int n = vd.nextInt();
		int x = vd.nextInt();
		int[] m = new int[n];
		int min = Integer.MAX_VALUE;
		for(int i=0; i<n;++i) m[i]= vd.nextInt();
		for(int i=0; i<n;++i) x = x - m[i];
		for(int i=0; i<n;++i) {
			if(min>m[i]) min = m[i];
		}
		int ans = n + x/min;
		System.out.println(ans);

	}

}
