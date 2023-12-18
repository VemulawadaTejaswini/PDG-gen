import java.util.Scanner;

/**
 * C - Build Stairs
 * 左右一列に N 個のマスが並んでおり、左から i 番目のマスの高さは Hi です。
 * あなたは各マスについて 1 度ずつ次のいずれかの操作を行います。
 * ・マスの高さを 1 低くする。
 * ・何もしない。
 * 操作をうまく行うことでマスの高さを左から右に向かって単調非減少にできるか求めてください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 並んでいるマスの数
        int n = sc.nextInt();
//        System.out.println( "n : " + n );
        int[] h = new int[n];
        String result = "Yes";

        for( int i = 0; i < n; i++ ) {
            h[i] = sc.nextInt();
            if( i != 0 ) {
                if( h[i] - h[i - 1] <= -2 ) {
                    result = "No";
                    break;
                }
                else if( h[i] - h[i - 1] == -1 ) {
//                    System.out.println( "h : " + h[i] );
                    h[i - 1] = h[i - 1] - 1;
                    if( i >= 2 ) {
                        if( h[i] - h[i - 2] <= -1 ) {
                            result = "No";
                            break;
                        }
                    }
                }
            }
        }

        System.out.println( result );

        sc.close();
    }
}