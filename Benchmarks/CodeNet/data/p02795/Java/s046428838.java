import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        int N = scan.nextInt();
        int a = N%Math.max(H, W);
        int ans = N/Math.max(H, W);
        if(a != 0)ans++;
        System.out.println(ans);
    }
}
