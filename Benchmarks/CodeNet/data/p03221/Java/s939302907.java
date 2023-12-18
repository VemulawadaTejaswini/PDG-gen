import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][]cityInfo = new int[m][2];
		ArrayList<ArrayList<Integer>> townYearInfo = new ArrayList<ArrayList<Integer>>();
		for(int i =0;i < n;i++) {
			ArrayList<Integer> yearInfo = new ArrayList<Integer>();
			townYearInfo.add(yearInfo);
		}
		for(int i =0;i < m;i++) {
			cityInfo[i][0] = sc.nextInt();
			cityInfo[i][1] = sc.nextInt();
			townYearInfo.get(cityInfo[i][0]-1).add(cityInfo[i][1]);
		}
		for(int i =0;i <n;i++) {
			Collections.sort(townYearInfo.get(i));
		}
		for(int i =0;i <m;i++) {
			StringBuilder answer = new StringBuilder();
			String ken = String.valueOf(cityInfo[i][0]);
			for(int j = 0;j <6 -ken.length();j++) {
				answer.append("0");
			}
			answer.append(ken);
			String cityNumber
				= String.valueOf(townYearInfo.get(cityInfo[i][0] -1).indexOf(cityInfo[i][1]) +1);
			for(int j = 0;j <6 -cityNumber.length();j++) {
				answer.append("0");
			}
			answer.append(cityNumber);
			System.out.println(answer);
		}
	}
}