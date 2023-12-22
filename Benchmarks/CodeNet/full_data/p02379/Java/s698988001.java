import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = scan.nextDouble();	// １つ目の座標を代入
        double y1 = scan.nextDouble();	
        
        double x2 = scan.nextDouble();	// ２つ目の座標を代入
        double y2 = scan.nextDouble();	
            
            		// 結果を表示
        System.out.println( dist( x1, y1, x2, y2 ) );
    }
            
            
            	// (x1,y1)-(x2,y2)の直線距離を計算するメソッド
        private static double dist( double x1, double y1, double x2, double y2 ){
            	double l;
            	double dx, dy;
            
            		// x座標の差を計算してdxに代入
           		dx = x2 - x1;
            		// y座標の差を計算してdyに代入
            	dy = y2 - y1;
           
           		// ２点間の距離を計算してlに代入
            	l = Math.sqrt( dx * dx + dy * dy );
           
            		// 計算した距離を返す
            	return l;
        }


}

