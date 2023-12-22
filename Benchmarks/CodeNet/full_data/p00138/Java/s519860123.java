import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	static Scanner sc = new Scanner(System.in);
	private static final int GROUP = 8; //1???????????°
	public static int numb = 0;

	public static void main(String[] args) {
		Map<Double, Integer> runnerList1 = new TreeMap<Double, Integer>();
		Map<Double, Integer> runnerList2 = new TreeMap<Double, Integer>();
		Map<Double, Integer> runnerList3 = new TreeMap<Double, Integer>();

		for(int $ = 0; $ < GROUP * 3; $++) {
			//??\???????????????
			int num = sc.nextInt();
			double time = sc.nextDouble();

			if($ < GROUP) {
				runnerList1.put(time, num);
			} else if($ < GROUP * 2) {
				runnerList2.put(time, num);
			} else {
				runnerList3.put(time, num);
			}
		}

		//????????¨???
		double[] ans = new double[3];
		ans = choice(ans, runnerList1);
		ans = choice(ans, runnerList2);
		ans = choice(ans, runnerList3);

		Arrays.sort(ans);
		for(int $ = 0; $ < 2; $++) {
			int number = 0;
			if(runnerList1.containsKey(ans[$])) {
				number = runnerList1.get(ans[$]);
			} else if(runnerList2.containsKey(ans[$])) {
				number = runnerList2.get(ans[$]);
			} else {
				number = runnerList3.get(ans[$]);
			}
			System.out.println(number + " " + ans[$]);
		}

	}

	public static double[] choice(double[] array, Map<Double, Integer> list) {
		int count = 0;
		for(Double doub : list.keySet()) {
			if(count == 2) {
				array[numb++] = doub;
			} else if(count >= 3) {
				break;
			} else {
				System.out.println(list.get(doub) + " " + doub);
			}
			count++;
		}
		return array;
	}

}