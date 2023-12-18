import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean hasOdd = false;
        int odd = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.add(x);
            set.add(x);
            if (x % 2 != 0) {
                hasOdd = true;
                odd = x;
            }
        }
        int ans = Integer.MAX_VALUE;
        Collections.sort(list);
        if (hasOdd) {
            boolean warikirenai = false;
            for (int a : set) {
                if (a % odd != 0)
                    warikirenai = true;
            }
            if (warikirenai)
                ans = 1;
            else
                ans = list.get(0);
        } else {
            ans = list.get(0);
            boolean warikirenai = false;
            for (int a : set) {
                if (a % ans != 0)
                    warikirenai = true;
            }
            if (warikirenai)
                ans = 2;
            else
                ans = list.get(0);
        }
        System.out.println(ans);
        sc.close();


    }

}
