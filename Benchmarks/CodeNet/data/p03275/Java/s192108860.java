import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		List<Long> a = new ArrayList<>();
		String[] tokens = in.nextLine().split(" ");
		for (int i = 0; i < N; ++i) {
			a.add(Long.parseLong(tokens[i]));
		}
		List<Long> newList = new ArrayList<>();
		for (int i = 1; i <= N; ++i) { // sublistの長さ
			for (int j = 0; j <= N - i; ++j) { // sublistの開始位置
				newList.add(getMedium(a.subList(j, j + i)));
			}
		}
		System.out.println(getMedium(newList));

		in.close();
	}

	public static long getMedium(List<Long> list) {
		Collections.sort(list);
		int index = list.size() / 2;
		return list.get(index);
	}

	public static long getMedium2(List<Long> list) {
		Collections.sort(list);
		int index = list.size() / 2 + 1;
		return list.get(Math.min(index, list.size() - 1));
	}
}