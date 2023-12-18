import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
      
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++) {
          a[i] = sc.nextInt();
          
        }
      
      int max1 = 0;
      int max2 = 0;
      int idx = 0;
      for(int i = 0; i < n; i++) {
        if(a[i] > max2) {
          max2 = a[i];
        }
        if(a[i] > max1) {
          max2 = max1;
          max1 = a[i];
          idx = i;
        }
      }
      
      for(int i = 0; i < n ; i++ ) {
        if(i == idx) {
          System.out.println(max2);
        } else {
          System.out.println(max1);
        }
      }
          
    
    }
}