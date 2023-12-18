import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if (x >=y){
            System.out.println(x % y);
        }
        else {
            System.out.println(y-x);
        }
    }
}