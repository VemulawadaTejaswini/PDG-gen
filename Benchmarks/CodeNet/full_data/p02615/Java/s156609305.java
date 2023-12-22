import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        int min = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            int m =sc.nextInt();
            ans+=m;
            min = Math.min(min,m);
        }
        System.out.println(ans-min);
    }
}
