import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 0; // ????????????????????°
		long unitPrice = 0; // ?£??????????
		long soldNum = 0; // ?£?????????°
		long number[] = new long[4001]; // ????????????????????????
		boolean judge = false; // ????????°
		ArrayList<Integer> answer = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		/**
		 * ???????????\???
		 */
		while (true) {
			n = sc.nextInt();
			int data[] = new int[n]; // ??\???????????????????????¨??????
			if (n == 0) {
				break; // 0??§??????
			}
			for (int i = 0; i < 4001; ++i) {
				number[i] = 0; // ?????????????????????
			}
			for (int j = 0; j < n; ++j) {
				data[j] = sc.nextInt(); // map???????????????????£?,??????????????\???.
				unitPrice = sc.nextLong();
				soldNum = sc.nextLong();
				number[data[j]] += unitPrice * soldNum; // ????????¨?£?????????°??????????????????????????????????´?
			}
			// ??????
			for (int i = 0; i < n; ++i) {
				if (number[data[i]] >= 1000000) {
					judge = true;
					answer.add(data[i]);
					data[i] = 0; // data[i]???????????????????????????????????¨?????????????????????
				}
			}
			if(judge == false){
				answer.add(-1); //100????¶???????????????????????????£?????¨??????-1???????????\??????
			}
		}
		//??¨???
		for (int i = 0; i < answer.size(); ++i){
			if(answer.get(i) == -1){
				System.out.println("NA");
			}
			else
		System.out.println(answer.get(i));
		}
		sc.close();
	}

}