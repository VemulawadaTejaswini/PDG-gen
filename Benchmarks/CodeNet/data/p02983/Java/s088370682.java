import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);

        String[] params = in.nextLine().split(" ");
        Long l = Long.parseLong(params[0]);
        Long r = Long.parseLong(params[1]);

        Long min = new Long(-1);
        Long first = new Long(-1);
        Long firstI = new Long(-1);
        for( Long i = l ; i < r ; i++ ){
            if( firstI == -1 ){
                firstI = i % 2019;
            }
            else if( firstI < i % 2019 ){
                continue;
            }
            int count = 0;
            for( Long j = i + 1 ; j <= r && count < 2019; j++ , count++){
                Long mod = ( i * j ) % 2019;
                if( first == -1 ){
                    first = mod;
                }
                else if( first.equals(mod) ){
                    break;
                }
                if( min == -1 ){
                    min = mod;
                }
                else if( mod < min ){
                    min = mod;
                }
            }
        }
        System.out.println(min);

    }
}