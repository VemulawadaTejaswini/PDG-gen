import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Main {

    //グローバル変数を定義

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();

        if(d == 25){
            System.out.println("Christmas");
        } else if(d == 24){
            System.out.println("Christmas Eve");

        } else if(d == 23){
            System.out.println("Christmas Eve Eve");

        } else {
            System.out.println("Christmas Eve Eve Eve");

        }
    }
}

//
//class Gauss {
//    //連立方程式の係数
//    //a[N][N](係数行列)とb[1](定数)を一緒にしたもの
//    double a[][];
//    int N;
//
//    Gauss(double[][] a, int N){
//        a = a;
//        N = N;
//    }
////    double a[][]={{1.0,1.0,1.0,1.0,10,0},
////            {2.0,1.0,3.0,2.0,21.0},
////            {1.0,3.0,2.0,1.0,17.0},
////            {3.0,2.0,1.0,1.0,14.0}};
////    int N=a.length;
//
//    //Gaussの消去法で連立方程式を解く
//    void gauss(){
//        //前進消去
//        double s;
//        for(int k=0; k<N-1; k++){
//            for(int i=k+1; i<N; i++){
//                s=a[i][k]/a[k][k];
//                for(int j=k+1; j<=N; j++){
//                    a[i][j] -= s * a[k][j];
//                }
//            }
//        }
//        //後退代入
//        for(int i=N-1; i>=0; i--){
//            s=a[i][N];
//            for(int j=i+1; j<N; j++){
//                s -= a[i][j] * a[j][N];
//            }
//            a[i][N] = s/a[i][i];
//        }
//    }
//    public static void run() {
//        Gauss gs= new Gauss();
//        gs.gauss();
//        //解の表示
//        System.out.println("ガウスの消去法による連立1次方程式の解");
//        for(int i=0; i<gs.N; i++){
//            System.out.println("x["+i+"] = "+gs.a[i][gs.N]);
//        }
//    }
//}
