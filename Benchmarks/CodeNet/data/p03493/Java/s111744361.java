import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] a = new String[3];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            a[i] = s.nextLine();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == "1") {
                count++;
            }
        }
        System.out.println(count);
        s.close();
    }
}