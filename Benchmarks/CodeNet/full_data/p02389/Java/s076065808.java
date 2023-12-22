import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int vertical = sc.nextInt();
            int horizontal = sc.nextInt();
            System.out.println(vertical * horizontal);
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            sc.close();
        }
    }
}