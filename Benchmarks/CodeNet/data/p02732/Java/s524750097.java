import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ballInfo = new int[n];
		int[] ballNoInfo = new int[n+1];
		for(int i =0; i< n;i++) {
			ballInfo[i] = sc.nextInt();
		}
		for(int i =0;i < ballInfo.length;i++) {
			ballNoInfo[ballInfo[i]]++;
		}
		Map<Integer,Integer> ballNoMap = new HashMap<Integer,Integer>();
		long base =0;
		for(int i=0; i < ballNoInfo.length;i++) {
			if(ballNoInfo[i] >=2) {
				ballNoMap.put(i, ballNoInfo[i]);
				base += ballNoInfo[i] * (ballNoInfo[i]-1)/2;
			}
		}

		for(int k = 1; k<= n;k++) {
			int kNonber = ballInfo[k-1];
			if(ballNoMap.containsKey(kNonber)) {
				int sabun = ballNoMap.get(kNonber)-1;
				System.out.println(base - sabun);

			}else {
				System.out.println(base);
			}
		}
	}
}