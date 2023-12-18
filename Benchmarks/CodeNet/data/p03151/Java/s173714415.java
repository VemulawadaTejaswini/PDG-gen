import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sumA = 0;
		int[] aArray = new int[n];
		long sumB = 0;
		int[] bArray = new int[n];
		for(int i=0;i < n;i++) {
			int tmp = sc.nextInt();
			aArray[i] = tmp;
			sumA += tmp;
		}
		for(int i=0;i < n;i++) {
			int tmp = sc.nextInt();
			bArray[i] = tmp;
			sumB += tmp;
		}

		if(sumA < sumB) {
			System.out.println(-1);
			return;
		}
		int answer = 0;
		long fusokuPoint = 0;
		List<Integer> yojoPointList = new ArrayList<Integer>();
		for(int i =0;i <n;i++) {
			if(bArray[i] > aArray[i]) {
				fusokuPoint += bArray[i] - aArray[i];
				answer++;
			}else {
				yojoPointList.add(aArray[i] - bArray[i]);
			}
		}
		if(fusokuPoint ==0) {
			System.out.println(0);
			return;
		}
		Collections.sort(yojoPointList,Collections.reverseOrder());
		for(Integer yojoPoint : yojoPointList) {
			answer++;
			fusokuPoint-= yojoPoint;
			if(fusokuPoint <=0) {
				break;
			}

		}
		System.out.println(answer);
	}

}