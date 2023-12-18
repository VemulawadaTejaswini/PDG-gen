
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] color = new int[9];
		int[] rate = new int[] {1, 400, 800, 1200, 1600, 2000, 2400, 2800, 3200};
		
		int a;
		
		for(int i = 0; i < n; i++) {
			a = sc.nextInt();
			for(int j = 0;j < 9; j++) {
				if(a < rate[j]) {
					color[j-1]++;
					//System.out.println(a + " " + j+color[j]);
					break;
				}else if(a >= rate[8]) {
					color[8]++;
					//System.out.println(a + " " + j+color[8]);
					break;
				}
			}
		}
		int count = 0;
		for(int i = 0; i < 9-1;i++) {
			//System.out.println(color[i]);//デバッグ
			if(color[i] != 0) {
				count++;
			}
		}
		if(count == 0)count++;
		System.out.print(count + " " + (count+color[8]));
	}
}