import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            p[i] = sc.nextInt();
        }
        sc.close();
        long[] qq = new long[n - k + 1];
        for(int i = 0 ; i <= n - k ; i++ ){
            for(int j = 0 ; j < k ; j++ ){
                qq[i] += p[i + j];
            }
            if(qq[0] < qq[i]){
                qq[0] = qq[i];
            }
        }
        double c = (qq[0] + k) / 2.0;
        System.out.println(c);
    }
}