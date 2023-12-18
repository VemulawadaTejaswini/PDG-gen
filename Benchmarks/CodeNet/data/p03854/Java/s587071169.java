import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (s.length() > 0) {
            if (s.endsWith("dream")) {
                s = s.substring(0, s.length() - 5);
            }
            else if (s.endsWith("dreamer")) {
                s = s.substring(0, s.length() - 7);
            }
            else if (s.endsWith("erase")) {
                s = s.substring(0, s.length() - 5);
            }
            else if (s.endsWith("eraser")) {
                s = s.substring(0, s.length() - 6);
            }
            else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
