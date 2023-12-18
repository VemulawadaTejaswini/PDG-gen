import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();

		StringBuilder [] list = new StringBuilder [N];
		HashMap <Integer,Integer> map = new HashMap <Integer,Integer>();
		for (int index=0; index<N; index++) {
			int time = sc.nextInt();
			int limit = sc.nextInt();
			StringBuilder sb = new StringBuilder (Integer.toString(limit));
			map.put(index,time);

			for (int index2=sb.length()-1; index2<9; index2++) {
				sb.insert(0, "0");
			}

			sb.append(index);
			list[index]=sb;
		}

		Arrays.sort(list);

		int totalTime = 0;
		boolean flag = true;
		for (int index=0; index<N; index++) {
			StringBuilder sb = new StringBuilder (list[index]);
			int limit = Integer.parseInt(sb.substring(0, 10));
			int num = Integer.parseInt(sb.substring(10));
			int time = map.get(num);
			totalTime+=time;
			if (totalTime>limit) {
				flag=false;
				break;
			}
		}

		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}