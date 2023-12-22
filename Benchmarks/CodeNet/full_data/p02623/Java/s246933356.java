import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextLong();
		long iSum = 0;
		ArrayList<Long> sumlist = new ArrayList<>();
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
			sumlist.add(read);
		}

		long ans = 0;
		for(int i = 0; i < sumlist.size(); i++) {
			if(ans < sumlist.get(i)) {
				ans = sumlist.get(i);
			}
		}
		System.out.println(ans);
		sc.close();
	}

}