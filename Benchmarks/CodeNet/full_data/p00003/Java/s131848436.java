import java.util.Scanner;
import java.util.Arrays;

class Main
{
    public static boolean isRTri(int a, int b, int c)
    {
        return a * a + b * b == c * c;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int k = 1; k <= n; k++)
        {
            int a[] = new int [3];
            for (int i = 0; i < 3; i++)
            {
                a[i] = input.nextInt();
            }
            Arrays.sort(a);
            boolean r = isRTri(a[0], a[1], a[2]);
            System.out.printf("%s\n", r ? "YES" : "NO");
        }
    }
}