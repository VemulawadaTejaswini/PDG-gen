import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        int N = sc.nextInt();
        int[] a = new int[N];
        int ans = 0;
        
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            ans += (a[i]-1);
        }
        
        System.out.println(ans);
        
    }
}
