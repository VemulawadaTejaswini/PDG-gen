import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.printf("%d ",a/b);
        System.out.printf("%d ",a%b);
        System.out.printf("%.10f",(double)a/b);
    }

}

