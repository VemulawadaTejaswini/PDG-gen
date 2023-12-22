import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var N = scanner.nextInt();
        if(N < 2) {
            if(N == 1)
                scanner.nextInt();
            System.out.println(N);
            return;
        }

        var A = new TreeSet<Integer>();
        var duplicated = new TreeSet<Integer>();
        for(int i=0; i<N; i++) {
            int a = scanner.nextInt();
            if(!A.add(a))
                duplicated.add(a);
        }
        var ps = new TreeSet<Integer>();
        while(!A.isEmpty()) {
            Integer p = A.pollFirst();
            A.removeIf(next -> next % p == 0);
            if(!duplicated.contains(p))
                ps.add(p);
        }
        System.out.println(ps.size());
    }
}