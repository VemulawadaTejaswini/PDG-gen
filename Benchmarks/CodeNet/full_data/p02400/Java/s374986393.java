import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int r = 0;
        double pi = Math.PI;

        Scanner sc= new Scanner(System.in);

        r = sc.nextInt();

        System.out.println( ( 2 * pi * r ) + " " + ( pi * r * r));
        sc.close();
    }

}

