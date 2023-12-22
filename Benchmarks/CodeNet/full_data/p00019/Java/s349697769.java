import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        int a=1;
        for (int n=(new Scanner(System.in)).nextInt(); n>0; a*=n--);
        System.out.println(a);
    }
}