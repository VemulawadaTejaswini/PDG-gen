import java.util.Scanner;

class Main{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		String T=sc.next();
		int[] start=new int[26];
		int[] goal=new int[26];		//変換テーブル
		for(int i=0; i<26; i++) {
			start[i]=-1;
			goal[i]=-1;
		}

		for(int i=0; i<S.length(); i++) {
			int a=S.charAt(i)-'a';
			int b=T.charAt(i)-'a';
			if(start[a]!=-1 || goal[a]!=-1) {
				if(start[a]!=b || goal[b]!=a) {		//変換テーブル通りならよい
					System.out.println("No");
					System.exit(0);
				}
			}
			else {
				start[a]=b;
				goal[b]=a;
			}
		}
		System.out.println("Yes");
	}
}