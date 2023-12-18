import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int n = 1;
		while((1<<n-1)-1<l) n++;
		n--;
		for (int i = 1; i < n; i++) {
			System.out.printf("%d %d %d\n",i,i+1,0);
			System.out.printf("%d %d %d\n",i,i+1,1<<(i-1));
		}
		int max = (1<<n-1)-1;
		while(l-max>1) {
			int k = 1;
			while(1<<k-1<l-max-1) k++;
			k--;
			System.out.printf("%d %d %d\n",k,n,max+1);
			max += 1<<k;
		}
		sc.close();
	}
}