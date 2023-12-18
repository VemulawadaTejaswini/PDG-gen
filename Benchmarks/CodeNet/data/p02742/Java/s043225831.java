import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long h = in.nextInt();
        long w = in.nextInt();
        if(h>1 && w>1) {
            System.out.println((long)Math.ceil(h * w / 2.0));
        }
        else {
            System.out.println(1);
        }
    }
}
