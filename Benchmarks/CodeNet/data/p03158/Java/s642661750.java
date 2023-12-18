import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c[]=new int[a];
		int d[]=new int[b];
		for(int i=0;i!=a;i++) {
			c[i]=scan.nextInt();
		}
		for(int i=0;i!=b;i++) {
			d[i]=scan.nextInt();
		}
		int ans=0;int x=0;int k=0;int basyo=114514;
for(int i=0;i!=b;i++) {
	k=0;
	int[]unko=c.clone();
	Arrays.sort(unko);
	ans=0;
	x=d[i];
	for(int j1=a-1;j1!=-1;j1--) {
		if(k%2==0) {
			if(unko[j1]>0){
			ans+=unko[j1];
			unko[j1]=-1;
			j1=a;
			k++;
			}
			continue;
		}
		else if(k%2==1){
			basyo=114514;
			int min=114514;
			for(int n=0;n!=a;n++){
				if(Math.abs(x-unko[n])<min&&unko[n]>0) {
					basyo=n;
					min=Math.abs(x-unko[n]);
				}
			}
			if(basyo!=114514) {
			unko[basyo]=-1;
			j1=a;
			k++;
			}
			continue;
		}
	}
	System.out.println(ans);
}
}
	}