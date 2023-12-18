import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bits = new int[n];
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < 10; j++){
                sum *= 2;
                sum += sc.nextInt();
            }
            bits[i] = sum;
        }
        int[][] pro = new int[n + 1][11];
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= 10; j++){
                pro[i][j] = sc.nextInt();
            }
        }
        int max = -100000000;
        for(int i = 1; i < 1024; i++){
            int sum = 0;
            for(int j = 1; j <= n; j++){
                sum += pro[j][Integer.bitCount((i & bits[j - 1]))];
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
