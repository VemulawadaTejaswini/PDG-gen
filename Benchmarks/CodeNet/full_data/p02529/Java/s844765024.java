import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<Integer>();
        Set<Integer> t = new HashSet<Integer>();

        Scanner scan = new Scanner(System.in);
        int noItemsS = scan.nextInt();
        int noItemsT = scan.nextInt();
        for (int i = 0; i < noItemsS; i++)
            s.add(scan.nextInt());
        for (int i = 0; i < noItemsT; i++)
            t.add(scan.nextInt());

        int count = 0;
        for (Integer n: t)
            if (s.contains(n))
                count++;

        System.out.println(count);
    }
}