import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);
        int s = Integer.parseInt(in.nextLine());
        int big = s/100;
        int small = s%100;

        if( big > 12 && small >12 ){
            System.out.println("NA");
        }
        else if( big > 12 && small <= 12 ){
            System.out.println("YYMM");
        }
        else if( big <= 12 && small > 12 ){
            System.out.println("MMYY");
        }
        else {
            System.out.println("AMBIGUOUS");
        }
    }
}