import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    
        int N = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int ans = 0;
        ans += X;
        ans += Math.max(0,(N-K)*Y);
        System.out.println(ans);
    }
}
