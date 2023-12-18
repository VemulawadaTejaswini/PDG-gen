import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        long n = Long.parseLong( params[0]);
        long a = Long.parseLong( params[1]);
        long b = Long.parseLong( params[2]);

        if( ( b - a ) % 2 != 0 ){
            long countWin = a - 1;
            b -= countWin;
            countWin++;
            b--;
            countWin += ( b - 1 ) / 2;

            long countLose = n - b;
            a += countLose;
            countLose++;
            a++;
            countLose += ( n - a ) / 2;

            System.out.println( countWin < countLose ? countWin : countLose );
        }
        else {
            System.out.println( ( b - a ) / 2 );
        }

    }

}