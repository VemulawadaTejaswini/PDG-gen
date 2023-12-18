import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int flg = 1;
		int count = 0;
		int now = 0;

		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();

			if(now == a[i] & flg == 1) {
				flg = 0;
				count += 1;
			}else {
				flg = 1;
			}

			now = a[i];
		}

		System.out.println(count);


	}
}