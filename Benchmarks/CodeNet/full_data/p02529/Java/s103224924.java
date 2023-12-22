import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<Integer> s = new HashSet<Integer>();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++)
            s.add(scan.nextInt());

        Set<Integer> t = new HashSet<Integer>();
        int q = scan.nextInt();
        for (int i = 0; i < q; i++)
            t.add(scan.nextInt());

        Set <Integer> u = new HashSet<Integer>(s);
        u.retainAll(t);

        int c = u.size();
        System.out.println(c);
    }
}