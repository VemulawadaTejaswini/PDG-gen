import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		listMoney(list, N, 6);
		listMoney(list, N, 9);
		Collections.sort(list);

		int []m = new int[N + 1];
		m[1] = 1;
		m[2] = 2;
		m[3] = 3;
		m[4] = 4;
		m[5] = 5;
		m[6] = 1;
		m[7] = 2;
		m[8] = 3;
		m[9] = 1;
		int t = 0;
		for(int i = 10; i <= N; i++) {
			if(isCheck(i, 9)) {
				m[i] = 1;
			}else if(isCheck(i, 6)) {
				m[i] = 1;
			}else {
				t = i;
				int k = 100000;
				int a;
				for(int j = 0; j < list.size(); j++) {
					a = t - list.get(j);
					if(a >= 0) {
						if(k > m[a] + 1) {
							k = m[a] + 1;
						}
					}else {
						break;
					}
				}
				m[i] = k;
			}
		}
		System.out.println(m[N]);

	}
	public static void listMoney(ArrayList<Integer> list, int N, int k) {
		int t = 0;
		int i = 1;
		while(N - t >=0) {
			t = (int) Math.pow(k, i);
			list.add(t);
			i ++;
		}
	}
	public static boolean isCheck(int n, int k) {
		int t = 0;
		int i = 0;
		while(n - t >= 0) {
			t = (int) Math.pow(k, i);
			i ++;
			if(n - t == 0) {
				return true;
			}
		}

		return false;
	}
}