import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int count=0;
		for(int i=1;i<=n;i++) {
			a[sc.nextInt()-1]=i;
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}

