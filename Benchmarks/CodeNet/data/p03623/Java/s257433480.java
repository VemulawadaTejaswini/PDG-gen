import java.util.Scanner;

/**
 * Created by Admin on 2017-08-13.
 */

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println( "Podaj pozycje X potem pozycje punku A i B");

    int X = input.nextInt();
    int A = input.nextInt() ;
    int B = input.nextInt();
    if (Math.abs(X-A) < Math.abs(X-B))
            System.out.println("A");
    else {
        System.out.println("B");
    }
            }
        }
     
