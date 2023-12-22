import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String[] strArray;
			ArrayList<Integer> intList = new ArrayList<Integer>();			
			int sum = 0;
			int num ,max, min;
			
			int n = Integer.parseInt(br.readLine());
			strArray = br.readLine().split("\\s");

			for (String str : strArray) {
				intList.add(Integer.parseInt(str));
			}
			max = intList.get(0);
			min = intList.get(0);
			
			for (int i = 0; i < n; i++) {
				num = intList.get(i);
				if (max < num) {
					max = num;
				} else if (min > num) {
					min = num;
				}
				sum += num;
			}
			intList.clear();
			System.out.println(min +" "+ max +" "+ sum);
			br.close();
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}