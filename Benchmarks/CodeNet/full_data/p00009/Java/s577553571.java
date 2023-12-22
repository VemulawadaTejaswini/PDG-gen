package training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Main{
	private static ArrayList<Integer> list = new ArrayList<Integer>();
	

	public static void main(String[] a) throws IOException {
		System.out.println(new Date());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> al = new ArrayList<Integer>();
		String str;

		// Input
		while ((str = br.readLine()) != null) {
			if (str.length() == 0) {
				break;
			}
			al.add(Integer.parseInt(str));
		}

		// PrimeCnt
		list.add(2);
		int[] cnt = new int[al.size()];
		for (int i = 0; i < al.size(); i++) {
			cnt[i] = (al.get(i) > 1) ? primeCnt(al.get(i)) : 0;
		}

		// Output
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(cnt[i]);
		}
	}

	private static int primeCnt(int no) {
		//int cnt = 0;
		for (int i = 2; i < no; i++) {
			if (primeCheck(i)) {
				//cnt++;
				list.add(i);
			}
		}
		return list.size();
	}

	private static boolean primeCheck(int checkNo) {
		// int no = checkNo / 2;
		// int no = (int)Math.sqrt((double)checkNo);
		for (int data : list) {
			if (checkNo % data == 0) {
				return false;
			}
		}
		/*
		 * for (int i = no; i > 1; i--) { if (checkNo % i == 0) { return false;
		 * } }
		 */
		return true;
	}
}