import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int monster = sc.nextInt();
		int teck = sc.nextInt();

		long[] HP = new long[monster];
		int[] anser = new int[monster];
		long count = 0;
		for(int i = 0; i <monster; i++) {
			HP[i] = sc.nextInt();
		}
//		Arrays.sort(HP, Collections.reverseOrder());
//		一番多いHPの持つモンスターに必殺技を与える。
//		それ以外はHP-1を行う
		for(int i = 0 ; i<monster; i++) {
			long MAX = Arrays.stream(HP).max().getAsLong();
			if(teck != 0) {
				for(int num =0;num<monster; num++) {
					if(HP[num] == MAX) {
						MAX = 0;
						HP[num] = MAX;
					}
				}
				teck -= 1;

			}else {
				for(int num =0;num<monster; num++) {
					if(HP[num] == MAX) {
						while(MAX != 0) {
							MAX -= 1;
							count++;
						}
						HP[num] = MAX;
					}
				}
			}
		}

		System.out.println(count);

	}
}



