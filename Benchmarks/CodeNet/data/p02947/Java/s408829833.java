
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.nextLine();
		String[] sArray = new String[n];
		for(int i = 0 ; i < n ; i++) {
			String tmp = sc.nextLine();
			char[] ch = tmp.toCharArray();
			Arrays.sort(ch);
			sArray[i] = new String(ch);
			ch = null;
			tmp = null;
		}
		Arrays.sort(sArray);
		long cnt = 0;
		long cat = 1;
		String pre = null;
		for(String s : sArray) {
			if(pre == null) {
				pre = s;
				continue;
			}
			if(!pre.equals(s)) {
				cnt += count(cat);
				cat = 1;
			} else {
				cat++;
			}
			pre = s;
		}
		cnt += count(cat);
		System.out.println(cnt);
		sc.close();

	}

	private static long count(long n) {
		long ret = 0;
		for(long i = 1 ; i <= n ; i++) {
			ret += (n - i);
		}
		return ret;
	}
}
