import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		long cnt = 0;
		
		for(int i = k + 1 ; i <= n ; i++) {
			int temp1 = (Math.floorDiv(n, i)) * (i - k);
			int temp2 = n % i;
			if(temp2 >= k && k == 0) {
				cnt += temp2 - k ;
			}
			if(temp2 >= k && k != 0) {
				cnt += temp2 - k + 1;
			}
			cnt += temp1;
		}
		
		System.out.println(cnt);

	}

}
