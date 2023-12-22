import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = gcd(x, y);
        System.out.println(ans);
        sc.close();

    }

    private static int gcd(int x, int y) {

        if(x == 0 || y == 0) return 0;
        int t;
        if(y > x){
            t = y;
            y = x;
            x = t;
        }
        while((t = x % y) != 0 ){
            x = y;
            y = t;
        }
        return y;
    }

}

