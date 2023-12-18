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
        List<Integer> start = new ArrayList<Integer>(m);
        List<Integer> end = new ArrayList<Integer>(m);
        int tot=0;
        int cnt= 0;
        int prev = xi.get(0);
        start.add(prev);
        for( int i=1; i<m; i++ ) {
            int x = xi.get(i);
            //
            if( x-prev>1 ) {
                cnt++;
                start.add(x);
                end.add(prev);
            } else {
                tot+=1;
                if( i+1==m ) end.add(x);
            }
            prev = x;
        }
        int sharding = start.size();
        List<Integer> dist = new ArrayList<Integer>(sharding-1){{
            for( int i=0; i<start.size()-1; i++ ){
                add( start.get(i+1) - end.get(i) );
            }
        }}; dist.sort(Comparator.comparingInt(x->x));
        //
        for( int i=0; i<sharding-n; i++) {
            tot+= dist.get(i);
        }
        System.out.println(tot);
    }
}
