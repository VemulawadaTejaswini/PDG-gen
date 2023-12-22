import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int[] lasts = new int[26+1];
        Arrays.fill(lasts, 1);
        int[] c = new int[26+1];
        for(int i = 1;i<=26;i++){
            c[i] = sc.nextInt();
        }

        int[][] s = new int[d+1][26+1];
        for(int i = 1;i<=d;i++){
            int maxx = 1;
            int va = -999999;
            for(int j = 1;j<=26;j++){ 
                s[i][j] = sc.nextInt();
                if(va < s[i][j] / lasts[j]) {
                    maxx = j;
                    va = s[i][j] / lasts[j];
                }
            }
            System.out.println(maxx);
            lasts[maxx] = i;
        }
    }
}
