import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int road = sc.nextInt();
		int[] floor = new int[road];

		for(int i = 0; i<road; i++) {
			floor[i] = sc.nextInt();
		}
		//max値を取り出す。
		for(int i = 0; i<floor.length; i++) {
			int anser = 0;
			for(int num = 0; num<floor.length;num++) {
				if(i == num) {
					continue;
				}else {
					anser = Math.max(anser, floor[num]);
				}
			}
			System.out.println(anser);
		}
	}
}
