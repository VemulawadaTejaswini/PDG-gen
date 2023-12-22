//10-B

//関数で考えるとわかりやすいかも
//三角関数　平方根の求め方　sqrt( x長さの2乗　＋　y長さの2乗 )

import java.util.Scanner;

class Main {
    public static void main(String [] args){
         
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();//辺の長さ a
        double b = sc.nextDouble();//辺の長さ b
        double C = sc.nextDouble();//aとbの間の角度
        double d = 0;//三角形　a,b　以外の残りの辺の長さ d
        double S;//面積
        double L;//周の長さ
        double h;// a を底辺にした時の高さ
        
        double rajiC = C * Math.PI / 180 ;//角度Cをラジアンに変換
        
        //高さ計算　計算式 h = b * sinC ※角度ではなくラジアン値を使う
        h = b * Math.sin(rajiC);
        
        //面積を求める 計算式　S = a * h / 2
        S = a * h / 2 ;
        
        //dの計算　角度が90度の時　sqrt( a*a + b*b ) 平方根
        //Lの計算
        double x = b * Math.cos(rajiC);
        double y = a - x ;
        d = Math.sqrt( h * h + y * y );
        L = a + b + d ;
        
        System.out.println( S + " " + L + " " + h );
        
        
        
        
    }
}