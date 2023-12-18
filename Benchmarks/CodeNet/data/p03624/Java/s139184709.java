import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[26];
		String s = sc.next();
		for (int i=0;i<s.length();i++) {
			a[s.charAt(i)-'a']++;
		}
		for (int i=0;i<26;i++) {
			if (a[i]==0) {
				System.out.println((char)(i+'a'));
				return ;
			}
		}
		System.out.println("None");
		return ;
	}

	public class People implements Comparable<People> {
		int a;
		int b;
		@Override
		public int compareTo(People o) {
			return this.a - o.a;
		}

	}
}