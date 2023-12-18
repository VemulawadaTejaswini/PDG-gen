import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int countMinus = 0;
		int countPlus = 0;
		int zero = 0;
		ArrayList<Integer> candle = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int c = sc.nextInt();
			candle.add(c);
			if(c < 0) {
				countMinus++;
			}else if(c == 0) {
				zero++;
			}else {
				countPlus++;
			}
		}
		
		// 要素数１の時は処理が面倒臭くなりそうなので最初に除外
		if(candle.size() == 1) {
			System.out.println(Math.abs(candle.get(0)));
			System.exit(0);
		}
		
		// +のみで周れるかチェック
		int onlyPlus = 0;
		if((countPlus + zero) >= k) {
			int count = 0;
			for(int i = 0; i < candle.size(); i++) {
				int target = candle.get(i);
				if(target < 0) {
					continue;
				}else {
					count++;
				}
				
				if(count == k) {
					onlyPlus = target;
				}
			}
		}
		
		// -のみで周れるかチェック
		int onlyMinus = 0;
		if((countMinus + zero) >= k) {
			int count = 0;
			for(int i = (candle.size() - 1); i >= 0; i--) {
				int target = candle.get(i);
				if(target > 0) {
					continue;
				}else {
					count++;
				}
				
				if(count == k) {
					onlyMinus = Math.abs(target);
				}
			}
		}
		
		
		/*
		 * candleの最初と最後を絶対値で比較
		 * 大きいほうを除外することを要素数がKになるまで行う
		 * →最短で周れるK本が選択されたことになる
		 */
		while(candle.size() > k) {
			int start = Math.abs(candle.get(0));
			int end = Math.abs(candle.get(candle.size() - 1));
			
			if(start >= end) {
				candle.remove(0);
			}else {
				candle.remove(candle.size() - 1);
			}
		}
		
		
		int time = 0;
		int start = candle.get(0);
		int end = candle.get(k - 1);
		if((start < 0) & (end > 0)) {
			if(Math.abs(start) <= Math.abs(end)) {
				time = Math.abs(start) * 2 + Math.abs(end);
			}else {
				time = Math.abs(start) + Math.abs(end) * 2;
			}
		}else if((start < 0) & (end < 0)) {
			time = Math.abs(start);
		}else if((start > 0) & (end > 0)) {
			time = Math.abs(end);
		}
		
		
		if((onlyPlus == 0) & (onlyMinus == 0)) {
			System.out.println(time);
		}else if(onlyPlus == 0){
			System.out.println(Math.min(onlyMinus, time));
		}else if(onlyMinus == 0) {
			System.out.println(Math.min(onlyPlus, time));
		}else {
			int a = Math.min(time, onlyPlus);
			int b = Math.min(time, onlyMinus);
			System.out.println(Math.min(a, b));
		}
		
	}

}