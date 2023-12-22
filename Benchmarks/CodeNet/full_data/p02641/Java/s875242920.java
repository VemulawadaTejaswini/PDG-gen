import java.util.*;

public class Main {
	public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var X = scanner.nextInt();
        var N = scanner.nextInt();

        var ps = new TreeSet<Integer>();
        for(int i=0; i<N; i++)
            ps.add(scanner.nextInt());

        if(ps.contains(X)) {
            System.out.println(X); return;
        }

        var ans = X;
        for(int i=1; ; i++) {
            ans = X-i;
            if(ps.contains(ans))
                break;
            ans = X+i;
            if(ps.contains(ans))
                break;
        }

        System.out.println(ans);
    }
}