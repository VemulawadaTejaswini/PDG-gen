import java.util.Scanner;

/**
 * Created by zzt on 17-1-16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if (s.endsWith("dream")||s.endsWith("dreamer")||s.endsWith("erase")||s.endsWith("eraser"))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}