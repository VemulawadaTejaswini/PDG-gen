import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int countMinus = 0;
		ArrayList<Integer> candle = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int c = sc.nextInt();
			candle.add(c);
			if(c < 0) {
				countMinus++;
			}
		}
		
		// 要素数１の時は処理が面倒臭くなりそうなので最初に除外
		if(candle.size() == 1) {
			System.out.println(Math.abs(candle.get(0)));
			System.exit(0);
		}
		
		int minusMax = 0;
		for(int i = candle.size() - 1; i >=0; i--) {
			if(candle.get(i) > 0) {
				continue;
			}else {
				if(minusMax == k) {
					candle.remove(i);
					continue;
				}else {
					minusMax++;
				}
			}
		}
		
		int minTime = 0;
		for(int i = 0; i <= candle.size() - k; i++) {
			int first = candle.get(i);
			int end = candle.get(i + k - 1);
			
			int time = 0;
			if((first < 0) & (end > 0)) {
				first = Math.abs(first);
				time = Math.min(first, end) * 2 + Math.max(first, end);
			}else if(end < 0){
				time = Math.abs(first);
			}else if(first > 0) {
				time = end;
			}
			
			if(i == 0) {
				minTime = time;
			}else {
				minTime = Math.min(minTime, time);
			}
		}
		
		System.out.println(minTime);
	}

}