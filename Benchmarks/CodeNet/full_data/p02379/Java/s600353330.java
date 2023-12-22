import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.printf("%f\n", Math.sqrt(Math.cbrt((double)(x2 - x1) + Math.cbrt((double)(y2 - y1)))));
        sc.close();
    }
}

