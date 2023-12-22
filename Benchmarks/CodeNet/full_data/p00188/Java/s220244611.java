import java.util.Scanner;

//Search
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[] a = new int[n];
			for(int i=0;i<n;i++)a[i]=sc.nextInt();
			int x = sc.nextInt();
			int c = 0;
			int l = 0;
			int r = n-1;
			int k = (l+r)/2;
			while(true){
				c++;
				if(l>=r)break;
				if(a[k]<x)l=k+1;
				else if(x<a[k])r=k-1;
				else if(x==a[k])break;
				k = (l+r)/2;
			}
			System.out.println(c);
		}
	}
}