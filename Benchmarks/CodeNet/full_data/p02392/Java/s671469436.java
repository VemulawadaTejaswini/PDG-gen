import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class Main{	//三つの整数の大小を比べる
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {	//Scanerクラスを変数scで使えるようにする
            int a = sc.nextInt();	//二つの変数a,b,cに整数を入力
            int b = sc.nextInt();
            int c = sc.nextInt();

            //かつ(&&),または(||)を用いたif文
            if(a < b && b < c) {			//bがaより大きくcがaより大きい場合
            	System.out.println("Yes");
            }else { 						//上記以外の場合
            	System.out.println("No");
            }
        }
    }
 }

