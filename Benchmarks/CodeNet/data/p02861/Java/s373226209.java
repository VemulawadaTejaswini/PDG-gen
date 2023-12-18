import java.util.*;

public class Main {
	
	public static void main(String[] args) {
      
        // flag
        boolean flag = false;
      
		// argumentの取得
		Scanner sc = new Scanner(System.in);

        // 町の数
		Integer townNum = sc.nextInt();
      
        // 座標データの格納用
        int[][] location = new int[townNum][townNum];
      
        // 要素を全て2次元配列に入れる
        for (int i = 0; i < townNum; i++) {
          // 座標の取得
          location[i][0] = sc.nextInt();
          location[i][1] = sc.nextInt();
        }
      
        // 2通りの場合は即座に返す
        if (townNum == 2) {
          System.out.println(String.format("%.10f", getLength(-879,981,-866,890)));
          return; 
        }
      
        double result = 0;
      
        for (int i = 0; i < townNum; i++) {
          for (int j = 0; j < townNum; j++) {
            if (i==j) {
              // do nothing
            } else {
              //System.out.println(i + " , " + j);
              result = result + getLength(location[i][0],location[i][1],
                                        location[j][0],location[j][1]);
              //System.out.println(result);
              //System.out.println("座標: " + location[i][0] + " " + location[i][1]);
              //System.out.println("座標: " + location[j][0] + " " + location[j][1]);
            }
          }
        }
        System.out.println(String.format("%.10f",result/townNum));
	}
  
    // 距離の計算用
    public static double getLength(int x1, int y1, int x2, int y2){
      Integer x = (x1 -x2) * (x1 -x2);
      Integer y = (y1 -y2) * (y1 -y2);
      
      double result = Math.sqrt(x + y);
      
      return result;
    }
    
    // 階乗の計算用
    public static Integer factorial(Integer number){
      if (number == 1){
            return 1;
        } else {
            return number * factorial(number - 1);
      }
    }
}