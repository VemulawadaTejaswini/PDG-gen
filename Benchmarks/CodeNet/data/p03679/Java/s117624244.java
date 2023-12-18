import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        if (a - b >= 0) {
            System.out.println("delicious");
        } else if (b - a <= x){
            System.out.println("safe");
        } else {
            System.out.println("dangerous");
        }
    }
}