mport java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int n = sc.nextInt();
        long[] a = new long[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int i = 1, j = 1;
        long x = a[0], y = a[n-1];

        while(i + j != n){
            if(Math.abs(x + a[i] - y) <= Math.abs(x - (y + a[n-1-j]))){
                x += a[i];
                i++;
            }else{
                y += a[n-1-j];
                j++;
            }
        }

        // 出力
        System.out.println(Math.abs(x-y));

    }

}