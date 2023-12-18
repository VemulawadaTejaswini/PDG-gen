import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] P = new int[N];
        for(int i=0;i<N;i++){
            P[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<N;i++) {
            for (int j = i; j < Math.min(i+K, N); j++) {
                if(P[i] > P[j]){
                    sum ++;
                }
            }
        }
        if(sum == 0){sum++;}
        System.out.println(sum);
        // 出力
//        System.out.println((a + b + c) + " " + s);
    }
}
