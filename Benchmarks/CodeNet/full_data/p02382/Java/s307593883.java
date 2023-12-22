//10-D
/*
２つのデータがどれだけ似ているかを、それらの距離で測る手法は、クラスタリングや分類など、
様々なところで使われています。ここでは、２つの n 次元ベクトル x={x1,x2,...,xn} と y={y1,y2,...,yn}の
距離を計算してみましょう

１行目に整数 n が与えられます。２行目にベクトル x の要素 {x1,x2,...xn}、
３行目にベクトル y の要素 {y1,y2,...yn} が空白区切りで与えられます。入力はすべて整数値です。
*/

import java.util.Scanner;

class Main {
    public static void main(String [] args){
         
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] x = new int[n];
        int[] y = new int[n];
        int[] z = new int[n];
        
        for(int i = 0 ; i < n ; i++ ){//配列xに代入
        	x[i] = sc.nextInt();
        }
        for(int j = 0 ; j < n ; j++ ){//配列yに代入
        	y[j] = sc.nextInt();
        }
        for(int k = 0 ; k < n ; k++ ){//x - x したものを代入
        	z[k] = Math.abs( x[k] - y[k] );//絶対値としいれる
        }
        
        //p1計算--------------------------------------------
        double sump1 = 0;
        for(int i = 0 ; i < n ; i++ ){
        	sump1 = sump1 + z[i];
        }
        System.out.println(sump1);
        
        //p2計算--------------------------------------------
        double sump2 = 0;
        for( int i = 0 ; i < n ; i++ ){
        	sump2 = sump2 + z[i] * z[i];	
        }
        sump2 = Math.sqrt(sump2);//sqrt平方根を計算する
        System.out.println(sump2);
        
        //p3計算--------------------------------------------
        double sump3 = 0;
        for( int i = 0 ; i < n ; i++ ){
        	sump3 = sump3 + z[i] * z[i] * z[i];	
        }
        sump3 = Math.cbrt(sump3);//cbrt立方根を計算する
        System.out.println(sump3);
        
        //pmax計算------------------------------------------
        double sumpmax = z[0];
        //double max = 0;
        for( int i = 0 ; i < n ; i++ ){
        	if( sumpmax < z[i]){
        		sumpmax = z[i];
        	}
        }
        System.out.println(sumpmax);
        
    }
}