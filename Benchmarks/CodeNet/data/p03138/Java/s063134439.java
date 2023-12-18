import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		long A[] = new long[N];
		int n = Long.toBinaryString(K).length();
		int ary1[] = new int[n];
		int ary2[] = new int[n];
		//System.out.println(n);
		
		//String str = "%0" + Integer.toString(n) + "b";
		for(int i = 0; i < N; i++) {
			A[i] = Long.parseLong(sc.next());
			//String bin = Long.toBinaryString(A[i]);
			StringBuilder bin_sb = new StringBuilder(Long.toBinaryString(A[i]));
			int aa = n - bin_sb.length();
			for(int k = 0; k < aa; k++) {
				bin_sb.insert(0, "0");
			}
			
			String bin = bin_sb.toString();
			for(int j = 0; j < n; j++) {
				if(bin.substring(j, j + 1).equals("0")) {
					ary1[j]++;
				} else {
					ary2[j]++;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			if(ary1[i] >= ary2[i]) {
				sb.append("1");
			} else {
				sb.append("0");
			}
		}
		String ans_str = sb.toString();
		long ans = 0;
		//System.out.println(Integer.parseInt(ans_str, 2));
		for(int i = 0; i < N; i++) {
			ans += Long.parseLong(ans_str, 2) ^ A[i];
		}
		System.out.println(ans);
	}
}
