
import java.util.HashMap;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String first = s.substring(0,n);
		String second = s.substring(n,n*2);

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i=0;i<1<<n;i++) {
			String tmp1 = "";
			String tmp2 = "";
			for (int j=0;j<n;j++) {
				if ((i>>j)%2!=0) {
					tmp1+=second.charAt(j);
				}
			}
			for (int j=n-1;j>=0;j--) {
				if ((i>>j)%2==0) {
					tmp2+=second.charAt(j);
				}
			}
			String tmp = tmp2+"_"+tmp1;
			if(map.containsKey(tmp)) {
				int x = map.get(tmp);
				map.put(tmp, x+1);
			} else {
				map.put(tmp, 1);
			}
		}
		long ans = 0;

		for (int i=0;i<1<<n;i++) {
			String tmp1 = "";
			String tmp2 = "";
			for (int j=0;j<n;j++) {
				if ((i>>j)%2!=0) {
					tmp1+=first.charAt(j);
				}
			}
			for (int j=n-1;j>=0;j--) {
				if ((i>>j)%2==0) {
					tmp2+=first.charAt(j);
				}
			}
			String tmp = tmp1+"_"+tmp2;
			if (map.containsKey(tmp)) {
//				System.out.println(tmp+" "+map.get(tmp));
				ans+=map.get(tmp);
			}
		}
		System.out.println(ans);
	}
}
