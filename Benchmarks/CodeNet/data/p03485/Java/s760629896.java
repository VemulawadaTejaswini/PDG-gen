import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int ans = (m+n)/2;

        System.out.println((m+n) % 2 != 0?ans+1:ans);
        
    }
}