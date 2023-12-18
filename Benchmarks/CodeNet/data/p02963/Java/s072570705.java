import java.util.Scanner;

public class Main {

    private static long longSqrt (long a) {
        long b = (long)Math.sqrt(a);
        if(b*b > a) {
            b--;
        }
        return b;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        if( str.length() == 1 ){
            Long s = Long.parseLong( str );
            if( s == 1 ){
                System.out.println( "0 0 0 1 1 1");
                return;
            }
        }

        Long sqrt = longSqrt(Long.parseLong(str) );

        System.out.println( "0 0 " + sqrt + " 0 0 " + sqrt );

    }

}