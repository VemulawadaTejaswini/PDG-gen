import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] xs = sc.next().toCharArray();
        Character current = null;
        int types = 0;
        for (int i = 0; i < n; i++) {
            char c = xs[i];
            if (current == null) {
                types++;
            }
            else if (c != current) {
                types++;
            }
            current = c;
        }

        System.out.println(types);
    }
}
