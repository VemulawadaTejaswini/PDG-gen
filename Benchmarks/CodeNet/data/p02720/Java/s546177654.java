import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int k = sca.nextInt();
		long loop = 1;
		long loop_hantei = 0;
		int[] keta = new int[12];
		boolean flag = true;
		boolean flag_runrun = true;
		while(flag) {
			flag_runrun = true;
			loop_hantei = loop;
			int i = 0;
			do {
				keta[i] = (int)(loop_hantei % 10);
				if(i > 0) {
					if(keta[i-1] - keta[i] > 1 || keta[i] - keta[i-1] > 1) {
						flag_runrun = false;
						break;
					}
				}
				loop_hantei /= 10;
				i++;
			} while(loop_hantei != 0);
			if(flag_runrun == true) {
				loop++;
				k--;
			}
			else {
				loop++;
				continue;
			}
			if(k == 0) {
				flag = false;
			}
		}
		System.out.println(loop - 1);

		// 後始末
		sca.close();
	}
}