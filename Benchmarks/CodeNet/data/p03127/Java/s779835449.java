import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean hasOdd = false;
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.add(x);
            set.add(x);
            if(x % 2 != 0) hasOdd = true;
        }
        if(set.size() == 1) System.out.println(list.get(0));
        else if(hasOdd) System.out.println(1);
        else System.out.println(2);
        sc.close();


    }

}
