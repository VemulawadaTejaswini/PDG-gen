import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(sc.nextInt());
        li.add(sc.nextInt());
        li.add(sc.nextInt());
        int k = sc.nextInt();
        Collections.sort(li);
        System.out.println(li.get(2) * Math.pow(2, k) + li.get(1) + li.get(0));
    }
}