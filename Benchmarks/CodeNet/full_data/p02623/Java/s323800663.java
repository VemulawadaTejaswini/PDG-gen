import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long k = sc.nextLong();
		long iSum = 0;
		long ans = 0;
		ArrayList<Long> alist = new ArrayList<>();
		ArrayList<Long> blist = new ArrayList<>();

		for(int i = 0; i < n; i++) {
			alist.add(sc.nextLong());
		}
		for(int i = 0; i < m; i++) {
			blist.add(sc.nextLong());
		}
		
		for(int i = 0; i < n; i++) {
			long sumMinutes = 0;
			long read = 0;			
			iSum += alist.get(i);
			sumMinutes += iSum;
			if(sumMinutes <= k) {
				read += i +1;
			}else {
				break;
			}

			for(int j = 0; j < m; j++) {
				sumMinutes += blist.get(j);
				if(sumMinutes <= k) {
					read++;
				}else {
					break;
				}
			}

			ans = Math.max(ans, read);
		}

		System.out.println(ans);
		sc.close();
	}

}