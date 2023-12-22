import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input;
		int n = s.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		int prev = 0;
		for (int i = 0; i < n; i++) {
			int x = s.nextInt();
			if (prev == x) {
				continue;
			}
			list.add(x);
			prev = x;
		}
		long ans = 0;
		long money = 1000;
		n = list.size();
		int start = 0;
		for (int i = 1; i < n; i++) {
			if (list.get(i) < list.get(i - 1)) {
				money = find(list, start, i - 1, money);
				start = i;
			}
		}
		money = find(list, start, n - 1, money);
		out.print(money);
		out.flush();
		out.close();
    }

	private static long find(List<Integer> list, int start, int end, long money) {
		long no = money / list.get(start);
		money -= no * list.get(start);
//		System.out.println(no + " " + (list.get(end) * no));
		return no * (long)(list.get(end)) + money;
	}
}
