import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int vertical = sc.nextInt();
            int horizontal = sc.nextInt();
            int size = vertical * horizontal;
            int circuit = 2 * vertical + 2 * horizontal;
            StringBuffer sb = new StringBuffer(size + " " + circuit);
            System.out.println(sb);
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            sc.close();
        }
    }
}