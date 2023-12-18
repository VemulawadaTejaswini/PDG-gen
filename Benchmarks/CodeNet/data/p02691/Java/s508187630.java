import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];   //a_max = 10^9なのでぎりぎり入る
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int[][] count = new int[200001][2];
        for(int i=0;i<n;i++){
            if(i + 1 + a[i] < 200001) {
                count[i + 1 + a[i]][0]++;
            }
            if(i + 1 - a[i] >= 0){
                count[i + 1 - a[i]][1]++;
            }
        }

        long ans = 0;
        for (int[] ints : count) {
            ans += ints[0] * ints[1];
        }
        System.out.println(ans);
    }
}
