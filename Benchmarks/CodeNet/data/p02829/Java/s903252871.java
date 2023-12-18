import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        if(a*b == 6) ans = 1;
        if(a*b == 3) ans = 2;
        if(a*b == 2) ans = 3;
        System.out.println(ans);
        sc.close();

    }

}
