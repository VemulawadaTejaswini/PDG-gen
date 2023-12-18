import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        int sum = 0;
        int seki = 1;
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
          int value = sc.nextInt();
          list[i] = value;
          seki *= value;
        }
        for (int i = 0; i < n; i++) {
          int partSeki = 1;
          for (int count = 0; count < n; count++) {
            if (i != count) {
              partSeki *= list[count];
            }
          }
          sum += partSeki;
        }
        double ans = (double)seki / (double)sum;
        System.out.println(ans);
	}
}