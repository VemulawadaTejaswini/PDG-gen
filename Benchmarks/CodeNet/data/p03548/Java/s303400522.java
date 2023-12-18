import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int ans = 0;
        ans  = (l -z)/ (y+z);
        System.out.println(ans);
    }
}

