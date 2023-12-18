import java.util.*;
 
public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        if (x >= 0 && x >= a){
            System.out.print(10);
        } else {
            System.out.print(0);
        }
    }
}