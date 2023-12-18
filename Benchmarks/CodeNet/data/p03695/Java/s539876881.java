import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		int count = 0;
		int minNum;
		int maxNum;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split("\\s");

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			list.add(Integer.parseInt(line[i]));
		}

		ArrayList<Integer> scoreList = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			int temp = list.get(i);
			if (temp < 400) {
				scoreList.add(1);
			} else if(temp < 800) {
				scoreList.add(2);
			} else if(temp < 1200) {
				scoreList.add(3);
			} else if(temp < 1600) {
				scoreList.add(4);
			} else if(temp < 2000) {
				scoreList.add(5);
			} else if(temp < 2400) {
				scoreList.add(6);
			} else if(temp < 2800) {
				scoreList.add(7);
			} else if(temp < 3200) {
				scoreList.add(8);
			} else if(3200 <= temp){
				scoreList.add(9);
			}
		}

		// 最小値
		for (int i = 0; i < scoreList.size(); i++) {
			int temp = scoreList.get(i);
			if(temp == 9) {
				count++;
			}
		}

		Set<Integer> set = new HashSet<>(scoreList);
		ArrayList<Integer> list2 = new ArrayList<>(set);
		minNum = list2.size() - (count - 1);

		System.out.print(minNum + " ");

		// 最大値
		System.out.println(minNum + count);
	}
}