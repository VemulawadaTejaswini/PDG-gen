
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();
        double s2 = 0;
        double D1 = 0;
        double D2 = 0;
        double D3 = 0;
        double Di = 0;
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = scan.nextInt();
        }
        for(int j = 0; j < n; j++){
            y[j] = scan.nextInt();
        }

        //マンハッタン距離
        for(int z = 0; z < n; z++){
            if((x[z] - y[z]) > 0){
                D1 += x[z] - y[z];
            }else{
                D1 += y[z] - x[z];
            }
        }
        System.out.println(D1);

        //ユークリッド距離
        for(int z = 0; z < n; z++){
            D2 += Math.pow(x[z]-y[z],2);
        }
        D2 = Math.sqrt(D2);
        System.out.println(D2);

        //3乗
        for(int z = 0; z < n; z++){
            if((x[z] - y[z]) > 0){
                D3 += Math.pow(x[z]-y[z],3);
            }else{
                D3 += Math.pow(y[z]-x[z],3);
            }
        }
        D3 = Math.cbrt(D3);
        System.out.println(D3);


        //チェビシェフ　1/p -> ０　に収束し、最大値の要素 xk0 - yk0 が残る
        Di = x[0] - y[0];
        //そもそもの初期値である　Di　が絶対値で最大を取っていたが、負の値で合った為、maxとして抽出されなかった。
        //従って、for 文においても0から比べないといけない
        System.out.println(Di);
        for(int i = 0; i < n; i++){
            if(x[i]-y[i] > 0){
                Di = Math.max(Di,x[i]-y[i]);
            }else{
                Di = Math.max(Di,y[i]-x[i]);
            }
        }
        System.out.println(Di);
    }
}

