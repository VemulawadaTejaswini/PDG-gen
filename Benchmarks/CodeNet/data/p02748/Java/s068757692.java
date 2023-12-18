import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();   //冷蔵庫の種類数
        int B = sc.nextInt();   //電子レンジの種類数
        int M = sc.nextInt();   //割引券の種類数
        int[] a = new int[A];   //冷蔵庫の値段
        int[] b = new int[B];   //電子レンジの値段
        int[] x = new int[M];
        int[] y = new int[M];
        int[] c = new int[M];   //割引額
        
        for (int i = 0; i < A; ++i){
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < B; ++j){
            b[j] = sc.nextInt();
        }
        for (int i = 0; i < M; ++i){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        
        int min = 0;
        for (int i = 0; i < M; ++i){
            int total = a[x[i]-1] + b[y[i]-1] - c[i];
            if (min > total || min == 0){
                min = total;
            }
        }
        
        System.out.println(min);

    }
}