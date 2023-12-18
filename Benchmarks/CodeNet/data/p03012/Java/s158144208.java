import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arrayv=new int[n];
		int sum1=0,sum2=0,min=99999;

		for(int i=0;i<n;i++) {
			arrayv[i]=sc.nextInt();
		}

		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				sum1+=arrayv[j];
			}
			for(int j=i;j<n;j++) {
				sum2+=arrayv[j];
			}
			min=Math.min(Math.abs(sum2-sum1), min);
			sum1=0;
			sum2=0;
		}
		System.out.println(min);

	}
}
/*
 6
khabarovsk 20
moscow 10
kazan 50
kazan 35
moscow 60
khabarovsk 40
 */

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));


