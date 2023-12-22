import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int c[]=new int[26];
		int s[][] = new int[D][26];
		for (int i = 0; i < 26; i++) {
			c[i]=sc.nextInt();
		}
		for (int i = 0; i < D; i++) {
			for (int j = 0; j < 26; j++) {
				s[i][j]=sc.nextInt();
			}
		}
		int mannzokudo = 0;
		int last[]=new int[26];
		for (int i = 0; i <26; i++) {
			last[i]=0;
		}
		for (int d = 1; d <D+1; d++) {
			int test = 0;
			for(int t=0;t<26;t++){
				int mannzokudotest=0;
				int lasttest[]=last.clone();
				mannzokudotest=mannzokudotest+s[d-1][t];
				lasttest[t]=d;
				for (int j = 0; j < 26; j++) {
					mannzokudotest=mannzokudotest-c[j]*(d-last[j]);
				}
				if(t==0){mannzokudo=mannzokudotest;}
				if(mannzokudotest>mannzokudo){
					mannzokudo=mannzokudotest;
					test=t;}
				lasttest=last;
				}
			System.out.println(""+(test+1));
			last[test]=d;
			mannzokudo=0;
		}
	}
}