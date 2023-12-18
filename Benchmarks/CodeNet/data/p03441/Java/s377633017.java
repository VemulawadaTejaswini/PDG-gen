import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static int n;
	public static int a[];
	public static int b[];
	public static int k[];
	public static ArrayList<Integer> used=new ArrayList<Integer>();
	public static boolean isK[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n-1];
		b=new int[n-1];
		k=new int[n];
		isK=new boolean[n];
		for(int i=0;i<n-1;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
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
		for(int i=0;i<n-1;i++) {
			if(used.contains(i))continue;
			if(a[i]==j) {
				used.add(i);
				countk(b[i],j);
				if(isK[b[i]]) {
					k[j]--;
					isK[j]=true;
				}
			}
			if(b[i]==j) {
				used.add(i);
					countk(a[i],j);
				if(isK[a[i]]) {
					k[j]--;
					isK[j]=true;
				}
			}
		}

	}

	}
