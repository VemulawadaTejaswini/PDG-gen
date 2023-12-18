import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        int[] b = new int[n];
        for(int i = n-1; i >= 0; i--)
            if((n - i) % 2 == 1) b[(n - i - 1) / 2]= a[i];
            else b[(n + i) / 2] = a[i];
        for(int i = 0; i < n; i++) System.out.print(b[i] + " ");
    }
}