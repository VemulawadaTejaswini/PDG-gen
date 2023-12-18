import java.util.Scanner;

public class Main {

	public static int n;
	public static int k[];
	public static boolean isC[][];
	public static boolean isK[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n-1];
		int[] b=new int[n-1];
		k=new int[n];
		isK=new boolean[n];
		isC=new boolean[n][n];
		for(int i=0;i<n-1;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			isC[a[i]][b[i]]=true;
			isC[b[i]][a[i]]=true;
			k[a[i]]++;
			k[b[i]]++;
		}
		for(int i=0;i<n;i++) {
			k[i]=Math.max(0, k[i]-2);
			isK[i]=(k[i]>0);
		}
		int ans=1;
		countk(0,-1);

		for(int i=0;i<n;i++) {
			ans+=Math.max(0, k[i]);
		}
		System.out.println(ans);
	}
	public static void countk(int j,int p) {//p:親
		for(int i=0;i<n;i++) {
			if(isC[j][i]&&i!=p) {
				countk(i,j);
				if(isK[i]) {
					k[j]--;
					isK[j]=true;
				}
			}
		}

	}

	}
