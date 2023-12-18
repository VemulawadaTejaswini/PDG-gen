import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		long[] data = new long[5];
		long n = sc.nextLong();
		for(int i = 0;i < 5;i++){
			data[i] = sc.nextLong();
		}
		
		long ans = 0;
		long min = Long.MAX_VALUE;
		for(int i = 0;i < 5;i++){
			min = Math.min(min, data[i]);
		}
		ans = (n/min) + 5;
		if(n % min == 0){
			ans--;
		}
		
		System.out.println(ans);
		
	}
	


}


class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}


