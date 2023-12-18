import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();        

        int add = 0;
        if(a > b) add = c - (a - b);
        if(add < 0) add = c;

        System.out.print(add);

        scan.close();
    }
}
