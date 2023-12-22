import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = a/b;
        int r = a%b;
        float f = (float)a/(float)b;
        
        System.out.println(d + " " + r + " " + f);
    }
}