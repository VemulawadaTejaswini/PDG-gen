import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		char[] ary = sc.next().toCharArray();
		int ans=0;
		Set<Character> set = null;
		for(int i=0; i<n;i++) {
			set = new HashSet<>();
			for(int j=0; j<=i;j++) {
				for(int k=i+1; k<n;k++) {
					if(ary[j]==ary[k]) set.add(ary[j]);
				}
			}
			if(ans < set.size()) ans = set.size();
		}
		System.out.println(ans);
	}
}