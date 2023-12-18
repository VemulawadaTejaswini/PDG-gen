import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static class S {
        int num;
        int index;
        public S( int num , int index ){
            this.num = num;
            this.index = index;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] params = in.nextLine().split(" ");
        S[] a = new S[n];
        for( int i = 0 ; i < n ; i++ ){
            a[i] = new S(Integer.parseInt(params[i]),i);
        }

        Arrays.sort(a, new Comparator<S>() {
            @Override
            public int compare(S o1, S o2) {
                return o1.num < o2.num ? -1 : 1;
            }
        });

        for( int i = 0 ; i < n ; i++ ){
            if( i != 0 ){
                System.out.print(" ");
            }
            System.out.print( a[i].index + 1);
        }
    }

}
