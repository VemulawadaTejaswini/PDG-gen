import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        int[] tList = new int[n];
        for(int i = 0; i < n; i++) {
          tList[i] = sc.nextInt();
        }
        int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
          // 出力
          int shortenIndex = sc.nextInt();
          int value = sc.nextInt();
          int sum = 0;
          for(int index = 0; index < n; index++) {
            if (index == shortenIndex - 1) {
              sum += value;
            } else {
              sum += tList[index];
            }
          }
		  System.out.println(sum);
        }
	}
}