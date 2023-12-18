import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
		int[] list = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
          int value = sc.nextInt();
          list[i] = value;
          sum += value;
        }
        int half = sum / 2;
        boolean isMinus = half < 0;
        int sunuke = 0;
        int pastSunuke = list[0];
        for (int i = 0; i < n - 1; i++) {
          sunuke += list[i];
          if (isMinus && sunuke <= half) {
            break;
          }
          if (!isMinus && sunuke >= half) {
            break;
          }
          pastSunuke = sunuke;
        }
      
        int ans1 = Math.abs(sunuke - (sum - sunuke));
        int ans2 = Math.abs(pastSunuke - (sum - pastSunuke));
		// 出力
		System.out.println(ans1 < ans2 ? ans1 : ans2);
	}
}