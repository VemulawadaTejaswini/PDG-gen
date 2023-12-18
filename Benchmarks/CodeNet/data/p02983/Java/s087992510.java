import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);

        String[] params = in.nextLine().split(" ");
        int l = Integer.parseInt(params[0]);
        int r = Integer.parseInt(params[1]);

        int min = -1;

        for( int i = l ; i <= r - 1 ; i++ ){
            for( int j = i + 1 ; j <= r ; j+=2019/i){
                int mod = (i * j) % 2019;
                if( min == -1 ){
                    min = mod;
                }
                else if( mod < min ){
                    min = mod;
                }

            }
        }

        System.out.println(min);

        return;

    }
}