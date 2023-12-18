
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        final int a=scanner.nextInt();
        final int b=scanner.nextInt();
        final int c=scanner.nextInt();
        final int d=scanner.nextInt();
        if(Math.abs(a-c)<=d){
            System.out.println("Yes");
            return;
        }

        if(Math.abs(a-b)<=d&&Math.abs(c-b)<=d){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");

    }

}