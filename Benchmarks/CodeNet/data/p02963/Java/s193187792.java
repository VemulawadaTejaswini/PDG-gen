import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Long s = Long.parseLong( str );

        if( s == 1 ){
            System.out.println( "0 0 0 1 1 1");
            return;
        }

        System.out.println( "0 0 " + str + " 0 0 1");

    }

}