import java.util.Scanner;

public class Solution
{
    public int computeMultiplication(int a, int b)
    {
        if(a > 9 || b > 9 || a == 0 || b == 0)
        {
            return -1;
        }

        return a * b;
    }

    public static void main(String args[]) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        Solution m = new Solution();
        //System.out.println("Enter a string");
        a = sc.nextInt();
        b = sc.nextInt();
        c = m.computeMultiplication(a, b);
        System.out.println(c);
    }
}
