import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] p = new int[k];
		int max = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<k-1;j++) {
				p[j] = p[j+1];
			}
			p[k-1] = sc.nextInt();
			max = Math.max(max, sum(p));
		}
		System.out.println((double)(max+k)/2);
	}

	public static int sum(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum += a[i];
		}
		return sum;
	}

}
