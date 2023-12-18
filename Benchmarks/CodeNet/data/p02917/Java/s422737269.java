import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int b[] = new int[n-1];
        Arrays.setAll(b, i -> stdIn.nextInt());
        long ans = 0;
        ans += b[0];
        ans += b[n-2];
        for(int i = 0; i+1 < n-1; i++){
             ans +=  Math.min(b[i], b[i+1]);
        }
        System.out.println(ans);
    }
}
