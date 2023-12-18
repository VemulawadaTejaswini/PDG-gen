import java.util.*;
public class Main {
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        
        final String input = sc.next();

        for (int i = 0; i < input.length(); i++) {
            System.out.print("x");
        }
        System.out.println();
        sc.close();
    }
}