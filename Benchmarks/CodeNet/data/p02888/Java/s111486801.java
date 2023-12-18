import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int len[]=new int[n];
		for(int i=0;i<n;i++) {
			len[i]=sc.nextInt();
		}
		Arrays.sort(len);
		int[][] start=new int[n][n];
		int[][] end=new int[n][n];
		int a=0;
		int sum=0;
		for(int i=0;i<n;i++) {

			for(int j=i+1;j<n;j++) {
				a=Math.max(j, start[i][j-1]);
				int sa=len[j]-len[i];
				int wa=len[j]+len[i];
				for(;a<n;a++) {
					if(len[a]>sa&&a!=i&&j!=a) {
						start[i][j]=a;
						break;
					}
					if(a==n-1) {
						start[i][j]=-1;
					}
				}
				int b=end[i][j-1];
				if(b==0) {
					b=a;
				}
				for(;b<n;b++) {
					if(len[b]>=wa&&b!=i&&b!=j) {
						end[i][j]=b-1;
						break;
					}
					if(b==n-1) {
						end[i][j]=b;
					}
				}
				if(start[i][j]!=-1&&end[i][j]>=start[i][j]) {
					sum+=end[i][j]-start[i][j]+1;
					/*if(i>=start[i][j]&&i<=end[i][j]) {
						sum--;
					}
					if(j>=start[i][j]&&j<=end[i][j]) {
						sum--;
					}*/

				}
			}
		//	System.out.println(sum);
		}
		/*for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				System.out.print(i+" "+j+ " ");
				System.out.print(start[i][j]+" ");
				System.out.println(end[i][j]);
			}
		}*/
		System.out.println(sum);
	}
}
