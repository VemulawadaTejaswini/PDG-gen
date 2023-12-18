import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        if( m<=n ){
            System.out.println(0);
            return;
        }
        List<Integer> xi = new ArrayList<Integer>(m){{
            for( int i=0; i<m; i++){ add(sc.nextInt()); }
        }}; xi.sort(Comparator.comparingInt(x->x));
        //
        List<Integer> dist = new ArrayList<Integer>(m-1){{
            int prev= xi.get(0);
            for( int i=1; i<m; i++) {
                int now = xi.get(i);
                add( now - prev );
                prev= now;
            }
        }}; dist.sort(Comparator.comparingInt(x->x));
        int tot= 0;
        for( int i=0; i<m-n; i++) {
            tot += dist.get(i);
        }
        System.out.println(tot);
    }
}
