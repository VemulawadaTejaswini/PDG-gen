import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		if(A == B) {
			System.out.println(A);
			return;
		}
		
		long cnt[][] = new long[13][2];
		for(int i = 12; i  >= 0; i--) {
			//System.out.println(A % Math.pow(2, i + 1) + ":" + Math.pow(2, i + 1) / 2);
			if(A % (long)Math.pow(2, i + 1) < (long)Math.pow(2, i + 1) / (long)2) {
				cnt[i][0] += (long)Math.pow(2, i + 1) - (long)(A % (long)Math.pow(2, i + 1));
			} else {
				cnt[i][1] += (long)Math.pow(2, i + 1) - (long)(A % (long)Math.pow(2, i + 1));
			}
			if(B % (long)Math.pow(2, i + 1) < (long)Math.pow(2, i + 1) / (long)2) {
				cnt[i][0] += B % (long)Math.pow(2, i + 1) + 1;
			} else {
				cnt[i][1] += B % (long)Math.pow(2, i + 1) + 1;
				if(A / (long)Math.pow(2, i + 1) == B / (long)Math.pow(2, i + 1) && cnt[i][1] > 0) {
					cnt[i][1]++;
				}
			}
		}
		
		String str = "";
		for(int i = 12; i >= 1; i--) {
			if(cnt[i][0] % 2 == 0 && cnt[i][1] % 2== 1) {
				str += "1";
			} else if(cnt[i][0] % 2 == 0 && cnt[i][1] % 2== 0) {
				str += "0";
			} else if(cnt[i][0] % 2 == 1 && cnt[i][1] % 2== 1) {
				str += "1";
			} else {
				str += "0";
			}
			//System.out.println(i + ": 0 :" + cnt[i][0]);
			//System.out.println(i + ": 1 :" + cnt[i][1]);
		}
		if(A % 2 == 1 && B % 2 == 1) {
			if(((B - A) / 2 + 1) % 2 == 1) {
				str += "1";
			} else {
				str += "0";
			}
		} else if(A % 2 == 0 && B % 2 == 0) {
			if(((B - A) / 2) % 2 == 1) {
				str += "1";
			} else {
				str += "0";
			}
		} else {
			if(Math.ceil((double)(B - A) / 2) % 2 > 0) {
				str += "1";
			} else {
				str += "0";
			}
		}
		//System.out.println(str);
		System.out.println(Long.parseLong(str, 2));
	}
}
