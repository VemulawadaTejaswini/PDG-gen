import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ai = new int[n];
        for(int i=0; i<n; i++) {
            ai[i] = in.nextInt();
        }
        int ans = 0;
        for(int i=0; i<n; i++) {
            if(i%2==0 && ai[i]%2==1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
