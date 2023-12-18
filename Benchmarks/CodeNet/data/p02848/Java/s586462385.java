import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] cs = sc.next().toCharArray();
        char[] out = new char[cs.length];

        for (int i = 0; i < cs.length; i++) {
            char c = cs[i];
            if (c + n > 'Z') {
                out[i] = (char) (c + n - 26);
            }
            else {
                out[i] = (char) (c + n);
            }
        }

        System.out.println(out);
    }
}
