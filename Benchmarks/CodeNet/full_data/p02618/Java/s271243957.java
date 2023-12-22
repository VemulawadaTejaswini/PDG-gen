import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        long[] lasts = new long[26+1];
        Arrays.fill(lasts, 1);
        long[] c = new long[26+1];
        for(int i = 1;i<=26;i++){
            c[i] = sc.nextInt();
        }

        long[][] s = new long[d+1][26+1];
        for(int i = 1;i<=d;i++){
            int maxx = 1;
            long va = -9999999;
            for(int j = 1;j<=26;j++){ 
                s[i][j] = sc.nextInt();
                if(va < s[i][j] - c[i] * lasts[j]) {
                    maxx = j;
                    va = s[i][j] - c[i] * lasts[j];
                }
            }
            System.out.println(maxx);
            lasts[maxx] = i;
        }
    }
}