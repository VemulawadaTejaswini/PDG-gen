import java.util.Scanner;

public class Main {
	static String s;
	static int k;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		k = sc.nextInt();
		if(s.charAt(0) == s.charAt(s.length()-1)) {
			//先頭と後尾の文字が同じ場合、先頭の該当文字を後尾に移動させる
			int same = 1;
			for(int i = 1; i < s.length(); i++) {
				if(s.charAt(i-1) == s.charAt(i)) {
					same++;
				} else {
					break;
				}
			}
			if(same == s.length()) {
				//全部の文字が同じ場合の処理
				same();
				System.exit(0);
			} else {
				s = s.substring(same) + s.substring(0, same);
			}
		}
		
		
		differ();
	}
	static void same() {
		long pri = s.length()*k/2;
		System.out.println(pri);
	}
	static void differ() {
		int cnt=1;
		int ans=0;
		for(int i = 1; i < s.length();i++) {
			if(s.charAt(i-1)==s.charAt(i)) {
				cnt++;
			} else {
				ans+=cnt/2;
				cnt=1;
			}
		}
		ans+=cnt/2;
		cnt=1;
		System.out.println(ans);
		System.out.println(k);
		long pri = ans*k;
		System.out.println(pri);
	}

}
