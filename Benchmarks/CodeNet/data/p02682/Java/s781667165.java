import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        
        int ans = 0;
        ans += Math.min(a, k);
        if(a+b < k){
            ans -= k - (a+b);
        }
        System.out.println(ans);
    }
}