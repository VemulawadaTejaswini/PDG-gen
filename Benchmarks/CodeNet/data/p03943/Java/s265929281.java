import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Seiya on 2016/10/16.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if((a + b + c) % 2 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }


}
