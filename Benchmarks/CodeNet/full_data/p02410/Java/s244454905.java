import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();;
        int[][] matrix = new int[height][width];
        int[] matrix2 = new int[width];
        
        //入力
        for(int hei = 0; hei < height; hei++){
            for(int wid = 0; wid < width; wid++){
                matrix[hei][wid] = sc.nextInt();    
            }
        }
        
        //入力
        for(int wid = 0; wid < width; wid++){
            matrix2[wid] = sc.nextInt();
        }
        
        // 出力
        for(int hei = 0; hei < height; hei++){
            int sumMultiplication = 0;
            for(int wid = 0; wid < width; wid++){
                sumMultiplication += matrix[hei][wid] * matrix2[wid];
                if(wid == width-1){
                    System.out.println(sumMultiplication);
                    continue;
                }
            }
        }
    }
}
