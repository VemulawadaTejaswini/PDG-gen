/**
 * Created by fanny on 16-10-23.
 */
import java.util.Scanner;

public class Main{

    public static void main (String[] args){

        Scanner scanner1 = new Scanner(System.in);
        String str = scanner1.nextLine();

        int ind1 = str.indexOf("C");
        int ind2 = str.indexOf("F");
        
        if(ind2>ind1 && ind1 >= 0)
            System.out.print("Yes");
        else
            System.out.print("No");

    }
}
