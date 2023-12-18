import java.lang.Math;
import java.util.Scanner;

public class Main
{
        public static void main( String[] args )
        {
                Scanner scan = new Scanner(System.in);
                String str = scan.nextLine();

                System.out.println(Integer.parseInt(str) * 2 * Math.PI);
                scan.close();

        }
}
