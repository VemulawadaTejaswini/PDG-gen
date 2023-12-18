import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s[] = new String[n];
		for(int i=0; i<n; i++) {
			s[i] = sc.next();
		}


		long ans = 0;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(checkAnagram(s[i], s[j])) {
					ans++;
				}
			}
		}
		System.out.println(ans);

	}

	private static boolean checkAnagram(String s1, String s2) {
		for(int i=0; i<10; i++) {
			char s1char = s1.charAt(i);
			int num = s2.indexOf(s1char);
			if(num == -1) {
				return false;
			} else {
				s2.replaceFirst(String.valueOf(s1char), "1");
			}
		}
		return true;
	}
}