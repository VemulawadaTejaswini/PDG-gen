import java.util.Arrays;
import java.util.Scanner;


public class KCakes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k, t;
		int[] numberOfEach;
		k = sc.nextInt();
		t = sc.nextInt();
		numberOfEach = new int [t];
		for (int i=0; i<t ;++i) {
			numberOfEach[i] = sc.nextInt();
		}
		Arrays.sort(numberOfEach);
			int type = t-2;
			int max = t-1;
			eatThroughDay(max, type, numberOfEach);
			System.out.println(numberOfEach[t-1]);
	}
	
	private static int eatUp(int type, int[] numberOfEach, int max) {
		if (type < 0) {
			return 1;
		}
		if (numberOfEach[max] == 0){
			return 0;
		}
		if (numberOfEach[type] == 0) {
			return 1;
		}
		--numberOfEach[max];
		--numberOfEach[type];
		return -1;
	}
	
	private static void eatThroughDay(int max, int type, int[] numberOfEach) {
		int result = -1;
		while ((result = eatUp(type, numberOfEach, max) )== -1) {
			--type;
			if (type < 0) {
				++type;
			}
			if (type == max) {
				return;
			}
		}
		if (result==0) {
			--max;
			if (max < 0) {
				return;
			}
			eatThroughDay(max, type, numberOfEach);
		}
		if (result==1) {
			--type;
			boolean isAllZero = true;
			if (type < 0) {
				++type;
				for (int i=type; i<numberOfEach.length-1; ++i){
					if (i < 0) {
						--numberOfEach[max];
						return;
					}
					if (numberOfEach[i] != 0) {
						isAllZero = false;
						type = i;
						break;
					}
				}
				if (isAllZero) {
					--numberOfEach[max];
					return;
				}
			}
			if (type == max) {
				return;
			}
			eatThroughDay(max, type, numberOfEach);
		}
	}

}
