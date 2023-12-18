import java.util.*;

class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for(int i=0;i<n;i++){
            h[i] = sc.nextInt();
            ans += (h[i]>=k)?1:0;
        }
        System.out.print(ans);
    }
}