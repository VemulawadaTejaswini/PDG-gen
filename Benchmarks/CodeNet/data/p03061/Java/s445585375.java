import java.util.*;
public class Main {
	public static void main(String[] args){

      	Scanner sc = new Scanner(System.in);

		// 1段目の宝石数
		int n = sc.nextInt();
 
      	int[] list = new int[n];

        // 2段目の数値
      	for (int i=0; i < n; i++) {
          list[i] = sc.nextInt();
        }

		int max = 0;
      
      	for (int i=0; i < n; i++) {
          
          for(int j=0; j < n; j++) {
            
            if (i != j) {
              
              int x;
              int y;
              if (list[i] > list[j]) {
                  x = list[i];
                  y = list[j];
              } else {
                  x = list[j];
                  y = list[i];
              }

              // ここからがユークリッドの互除法を用いた最大公約数を
              // 求める為の式
              int tmp;
              while ((tmp = x % y) != 0) {
                  x = y;
                  y = tmp;
              }
              
              if (y > max) {
                max = y;
              }
              
            }
            
          } 
          
        }
      
        System.out.println(max);      
      
	}
 
}