
import java.util.Scanner;

public class Main {

	private static final char UNAVAILABLE = 'Z';
	private static final int[][] table = {
		{60, 2, 600},
		{80, 5, 800},
		{100, 10, 1000},
		{120, 15, 1200},
		{140, 20, 1400},
		{160, 25, 1600}
	};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numItem = 0;
		while((numItem = sc.nextInt()) != 0){
			int fee = 0;
			int width, height, depth, weight;
			for(int i = 0; i < numItem; i++){
				width = sc.nextInt();
				height = sc.nextInt();
				depth = sc.nextInt();
				weight = sc.nextInt();
				fee += getFee(judgeSize(weight, width + height + depth));
			}
			System.out.println(fee);
		}
		sc.close();
	}
	
	public static int getFee(char size){
		return (size == UNAVAILABLE)? 0 : table[size - 'A'][2];
	}

	public static char judgeSize(int weight, int length){
		char s1 = judgeSizeByWeight(weight);
		char s2 = judgeSizeByLength(length);
		return (char)Math.max(s1, s2);
	}
	
	private static char judgeSizeByWeight(int weight){
		if(weight <= 2)	return 'A';
		if(weight <= 5)	return 'B';
		if(weight <= 10)	return 'C';
		if(weight <= 15) return 'D';
		if(weight <= 20)	return 'E';
		if(weight <= 25)	return 'F';
		return UNAVAILABLE;
	}
	
	private static char judgeSizeByLength(int length){
		if(length <= 60)	return 'A';
		if(length <= 80)	return 'B';
		if(length <= 100)return 'C';
		if(length <= 120)return 'D';
		if(length <= 140)return 'E';
		if(length <= 160)return 'F';
		return UNAVAILABLE;
	}
	
}