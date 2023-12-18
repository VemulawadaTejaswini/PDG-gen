import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n+1];
		long ans=0;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[a[i]]++;
		}

		for(int m=0;m<n+1;m++) {
			ans+=(b[m])*(b[m]-1)/2;
		}
		for(int i=0;i<n;i++) {
			if(b[a[i]]>1) {
			ans=ans-((b[a[i]])*(b[a[i]]-1)/2)+((b[a[i]]-1)*(b[a[i]]-2)/2);
			}
			System.out.println(ans);
			if(b[a[i]]>1) {
				ans=ans+((b[a[i]])*(b[a[i]]-1)/2)-((b[a[i]]-1)*(b[a[i]]-2)/2);
				}
		}
	}
}
