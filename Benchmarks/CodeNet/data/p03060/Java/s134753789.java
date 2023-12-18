import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int v [] = new int[n];
        int c [] = new int[n];
        Arrays.setAll(v, i -> stdIn.nextInt());
        Arrays.setAll(c, i -> stdIn.nextInt()); 
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(v[i] - c[i] > 0) ans += v[i] - c[i];
        }

        System.out.println(ans);
    }
}