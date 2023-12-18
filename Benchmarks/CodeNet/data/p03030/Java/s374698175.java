import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static class R {
        public int inputNum;
        public String name;
        public int point;
        public int rank;
    }

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt( in.nextLine() );
        List<String> rows = new ArrayList<>();
        for( int i = 0 ; i < n ; i++ ){
            rows.add( in.nextLine() );
        }

        List<R> rs = new ArrayList<>();
        for( int i = 0 ; i < n ; i++ ){
            String[] row = rows.get(i).split(" ");
            R r = new R();
            r.inputNum = i + 1;
            r.name = row[0];
            r.point = Integer.parseInt( row[1] );
            r.rank = 0;
            rs.add( r );
        }

        rs.sort(new Comparator<R>() {
            @Override
            public int compare(R o1, R o2) {
                int comp = o1.name.compareTo(o2.name);
                if( comp == 0 ){
                    return o2.point - o1.point;
                }
                else return comp;
            }
        });

        for( int i = 0 ; i < n ; i++ ){
            R r = rs.get(i);
            System.out.println( r.name + r.point + " " + r.inputNum);
        }

    }
}