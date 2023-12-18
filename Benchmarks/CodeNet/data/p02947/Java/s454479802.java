import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		int[][] x=new int[n][26];
		char[] y=new char[26];
		for(int i=0;i<n;i++) {
			for(int j=0;j<26;j++) {
				x[i][j]=0;
			}
		}
		char l='a';
		for(int i=0;i<26;i++) {
			y[i]=l;
		}
		for(int i=0;i<n;i++) {
			s[i]=sc.next();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<26;j++) {
				for(int p=0;p<s[i].length();p++) {
					if(s[i].charAt(p)==y[j]) {
						x[i][j]++;
					}
				}
			}
		}
		int c=0;
		int e=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				e=0;
				for(int z=0;z<26;z++) {
					if(x[i][z]==x[j][z]) {
						e++;
					}
				}
				if(e==26) {
					c++;
				}
			}
		}
		
		System.out.println(c);
	}

}