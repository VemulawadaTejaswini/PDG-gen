import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] cs = (s + s.substring(0, 1)).toCharArray();
        int n = sc.nextInt();

        long countInOnePattern = 0;
        for (int i = 1; i < cs.length; i++) {
            if (cs[i - 1] == cs[i]) {
                cs[i] = ' ';
                countInOnePattern++;
            }
        }

        long count = countInOnePattern * n;
        System.out.println(count);
    }
}
