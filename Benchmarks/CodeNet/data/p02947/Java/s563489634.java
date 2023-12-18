
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
		String pre = "";
		for(String s : sArray) {
			if(pre.equals(s))cnt++;
			pre = s;
		}
		if(cnt > 1)cnt++;
		System.out.println(cnt);
		sc.close();

	}

}
