import java.util.ArrayList;
import java.util.Scanner;

public class sample3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		long k = scan.nextLong();
		long countTime = 0;
		int count_n = 0;
		int count_m = 0;
		long countBook = 0;
		ArrayList<Long> n_list = new ArrayList<Long>();
		ArrayList<Long> m_list = new ArrayList<Long>();
		ArrayList<Boolean> n_check = new ArrayList<Boolean>();
		ArrayList<Boolean> m_check = new ArrayList<Boolean>();

		for(int i = 0;i < n;i++) {
			n_list.add(scan.nextLong());
			n_check.add(false);
		}

		for(int i = 0;i < m;i++) {
			m_list.add(scan.nextLong());
			m_check.add(false);
		}

		while(countTime < k) {
			if(judge(n_list , m_list , count_n , count_m , n , m)) {
				if(n_check.get(count_n)) {
					countTime += m_list.get(count_m);
					m_check.set(count_m, true);
					if(count_m + 1 < m) {
						count_m += 1;
					}
				}else {
					countTime += n_list.get(count_n);
					n_check.set(count_n, true);
					if(count_n + 1 < n) {
						count_n += 1;
					}
				}


			}else {
				if(m_check.get(count_m)) {
					countTime += n_list.get(count_n);
					n_check.set(count_n, true);
					if(count_n + 1 < n) {
						count_n += 1;
					}
				}else {
					countTime += m_list.get(count_m);
					m_check.set(count_m, true);
					if(count_m + 1 < m) {
						count_m += 1;
					}
				}

			}
			if(countTime > k) {
				break;
			}

			countBook += 1;

		}

		System.out.println(countBook);
	}

	public static boolean judge(ArrayList<Long> n_list , ArrayList<Long> m_list , int count_n , int count_m , int n , int m) {
			if(n_list.get(count_n) == m_list.get(count_m)) {
				if(count_n + 1 < n && count_m + 1 < m) {
					if(judge(n_list , m_list , count_n + 1 , count_m + 1 , n , m)) {
						return true;

					}else {
						return false;

					}
				}else if(count_n + 1 < n) {
					if(judge(n_list , m_list , count_n + 1 , count_m , n , m)) {
						return true;

					}else {
						return false;

					}
				}else if(count_m + 1 < m) {
					if(judge(n_list , m_list , count_n , count_m + 1 , n , m)) {
						return true;

					}else {
						return false;

					}
				}else {
					return true;

				}

			}else if(n_list.get(count_n) < m_list.get(count_m)) {
				return true;

			}else {
				return false;

			}
	}
}
