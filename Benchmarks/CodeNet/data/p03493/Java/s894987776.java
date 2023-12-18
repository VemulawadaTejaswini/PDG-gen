import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int s1 = a.nextInt();
        int s2 = a.nextInt();
        int s3 = a.nextInt();
        a.close();
        if (s1 == 1 ) {
            System.out.print(s1);
        }
        if (s2 == 1) {
            System.out.print(s2);
        }
        if (s3 == 1) {
            System.out.println(s3);
        }
    }
}
