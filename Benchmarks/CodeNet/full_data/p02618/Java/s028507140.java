import java.awt.Checkbox;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		long start=System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int c[]=new int[26];
		int s[][] = new int[D][26];
		int a[]=new int [D];
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
				int mannzokudotest=mannzokudo;
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
			last[test]=d;
			a[d-1]=test;
		}
		boolean condition = true;
		long no;
		while (condition) {
			no=System.currentTimeMillis();
			if(no-start>1900){condition=false;}
			int x =(int)Math.random()*26;
			int y = (int)Math.random()*26;
			if(x!=y){
				int p = a[x];
				a[x]=a[y];
				a[y]=p;
			}
			if(!check(D,c,s,a,mannzokudo)){
				int p = a[x];
				a[x]=a[y];
				a[y]=p;
			}
		}
		for (int i = 0; i < D; i++) {
			System.out.print(a[i]+1);
		}
	}
	public static boolean check(int D,int c[],int s[][],int t[], int m){
		int mannzokudo = 0;
		int last[]=new int[26];
		for (int i = 0; i <26; i++) {
			last[i]=0;
		}
		for (int d = 1; d <D+1; d++) {
			mannzokudo=mannzokudo+s[d-1][t[d-1]-1];
			last[t[d-1]-1]=d;
			for (int j = 0; j < 26; j++) {
				mannzokudo=mannzokudo-c[j]*(d-last[j]);
			}
		}
		if(mannzokudo>m){return true;}
		else{return false;}
	}
}