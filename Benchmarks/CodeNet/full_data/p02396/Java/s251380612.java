import java.util.*;

public class Main {

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int x;
        int i = 0;
        while((x = scan.nextInt()) != 0 && 0<x && x<10001 && i < 10001)
        {
            System.out.println("Case "+i+": "+x);
            i++;
        }
    }
}