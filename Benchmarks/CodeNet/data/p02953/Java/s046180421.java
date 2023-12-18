import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        int[] list = new int[n];
        int previous = 0;
        boolean decreased = false;
        boolean isFalse = false;
        for (int i = 0; i < n; i++) {
          int value = sc.nextInt();
          if (value < previous) {
            if (!decreased) {
              list[i - 1] -= 1;
              decreased = true;
            }
          } 
          previous = value;
          list[i] = value;
        }
        previous = 0;
        boolean judge = true;
        for (int i = 0; i < n; i++) {
          if (list[i] < previous) {
            judge = false;
            break;
          }
        }    
        if (judge) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
        
	}
}
