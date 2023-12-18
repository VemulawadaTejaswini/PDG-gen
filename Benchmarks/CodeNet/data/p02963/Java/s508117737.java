import java.util.Scanner;

public class Main {

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

        Long longParam = Long.parseLong(str);
        Long a = new Long(1);
        Long b = Long.parseLong(str);
        for( Long i = new Long(1) ; i < b ; i++ ){
            if( b % i == 0 ){
                a = i;
                b = longParam / a;
            }
        }
        System.out.println( "0 0 " + a + " 0 0 " + b );

    }

}