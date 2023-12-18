import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int q = scn.nextInt();
		char[] s = scn.next().toCharArray();;
		int[] l = new int[q];
		int[] r = new int[q];
		int[] ans = new int[q];
		for(int i = 0;i < q;i++) {
			l[i]=scn.nextInt()-1;
			r[i]=scn.nextInt()-1;
		}
		for(int i = 0;i < q;i++) {
			for(int j = l[i];j<r[i];j++) {
				if(s[j]=='A'&&s[j+1]=='C') {
					ans[i]++;
				}
			}
		}
		for(int a:ans) {
			System.out.println(a);
		}
		scn.close();
	}
}