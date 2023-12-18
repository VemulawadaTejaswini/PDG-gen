import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Long s = Long.parseLong( in.nextLine() );

        if( s == 1 ){
            System.out.println( "0 0 0 1 1 1");
            return;
        }

        System.out.println( "0 0 " + s + " 0 0 1");

    }

}