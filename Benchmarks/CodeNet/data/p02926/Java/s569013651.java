import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int num = sc.nextInt();
        
        int[][] array = new int[num][2];
      
        for(int i = 0; i < num; i++){
          array[i][0] = sc.nextInt();
          array[i][1] = sc.nextInt();
        }
		
        double max = 0;
      
        for(int i = 0; i < num; i++){
          int x = 0;
          int y = 0;
          double kyori = 0;
          for(int j = i; j < num; j++){
            int tempX = x + array[j][0];
            int tempY = y + array[j][1];
            
            double tempKyori = Math.sqrt(tempX * tempX + tempY * tempY);
            if(kyori < tempKyori){
              x = tempX;
              y = tempY;
              kyori = tempKyori;
            }
          }
          
          max = max < kyori ? kyori : max;
        }
      
		// 出力
		System.out.println(max);
	}
}