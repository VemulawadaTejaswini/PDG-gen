import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 配列
        int d = sc.nextInt();
        int[] c = new int[26+1];
        for(int i = 1;i<=26;i++){
            c[i] = sc.nextInt();
        }
        int[][] s = new int[d+1][26+1];
        for(int i = 1;i<=d;i++){
           for(int j = 1;j<=26;j++){ 
                s[i][j] = c[i] = sc.nextInt();
           }
        }
        long ans = 0;
        int[] t = new int[d+1];
        for(int i = 1;i<=d;i++){
            t[i] = sc.nextInt();
            ans += s[i][t[i]];
            System.out.println(ans);
        }
    }
}
