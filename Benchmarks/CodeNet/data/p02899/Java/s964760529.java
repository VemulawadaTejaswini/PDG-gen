import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
          int value = sc.nextInt();
          list[value - 1] = i + 1;
        }
      
        int target = 1;
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < n; i++) {
          if (i == 0) {
            builder.append(list[i]);
          } else {
            builder.append(" " + list[i]);
          }
        }
    
		// 出力
		System.out.println(builder.toString());
	}
}
