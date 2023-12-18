import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[j]>max && i!=j ) {
					max=a[j];
				}
			}
			System.out.println(max);
			if(i!=n-1)
			max=0;
		}

	}
}
