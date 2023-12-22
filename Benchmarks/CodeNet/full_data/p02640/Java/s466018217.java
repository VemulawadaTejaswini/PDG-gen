import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if( y < (2*x) || (y-2*x)%2 != 0 ) {
            System.out.println("No");
            return;
        }

        int kameN = (y-2*x)/2;
        if(kameN < x) {
            System.out.println("Yes");
            return;
        }
        
        System.out.println("No");

    }
}