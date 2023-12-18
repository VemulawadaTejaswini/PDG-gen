import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int k = sca.nextInt();
		long loop = 1;
		long loop_hantei = 0;
		int[] keta = new int[12];
		boolean flag_runrun = true;
		while(k != 0) {
			flag_runrun = true;
			loop_hantei = loop;
			int i = 0;
			do {
				keta[i] = (int)(loop_hantei % 10);
				loop_hantei /= 10;
				i++;
			} while(loop_hantei != 0);
			for(int j = i-1; j >= 1; j--) {
				if(keta[j] - keta[j-1] > 1 || keta[j-1] - keta[j] > 1) {
					flag_runrun = false;
					loop += (int)(Math.pow(10, (j-1)));
					break;
				}
			}
			if(flag_runrun == true) {
				loop++;
				k--;
			}
			else {
			}
		}
		System.out.println(loop - 1);

		// 後始末
		sca.close();
	}
}