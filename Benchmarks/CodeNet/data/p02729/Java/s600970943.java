import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = (((n+m)*(n+m-1))/2) - (n*m);
        System.out.println(ans);
    }
}