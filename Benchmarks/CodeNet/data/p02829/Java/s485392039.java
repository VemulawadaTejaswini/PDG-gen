import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        ArrayList <Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);

        for (i=0;i<=num.size()-1;i++) {
            int x = sc.nextInt();
           num.removeIf(n -> (n == x));
            int y = sc.nextInt();
            num.removeIf(n -> (n == y));
            System.out.println(num);
        }
    }
}