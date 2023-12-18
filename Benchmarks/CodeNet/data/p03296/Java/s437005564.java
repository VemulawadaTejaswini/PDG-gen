import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=sc.nextInt();
			int[] a=new int[n];
			int count=0;
			a[0]=sc.nextInt();
			for(int i=1; i<n; i++) {
				a[i]=sc.nextInt();
				if(a[i]==a[i-1]) {
					count++;
					a[i]=1000;
				}
			}
			System.out.println(count);
		}
	}
}