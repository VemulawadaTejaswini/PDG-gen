import java.util.Scanner;

/**
 * Created by dizzyvn on 6/24/17.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int z = b - a;

        if (z < 0) {
            System.out.println("delicious");
        }
        else if (z <= x) {
            System.out.println("safe");
        } else {
            System.out.println("dangerous");
        }
    }
}
