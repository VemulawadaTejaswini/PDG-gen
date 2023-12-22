import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        
        int ans = 0;

        for (int i=0; i<n; i++)
            for (int j=i+1; j<n; j++)
                for (int k=j+1; k<n; k++)
                    if (isTriangle(arr[i], arr[j], arr[k]))
                        ans++;
        
        System.out.println(ans);
    }

    public static boolean isTriangle(int x, int y, int z)
    {
        if (x == y || y == z || x == z)
            return false;

        if (x>y && x>z)
            return y+z>x;
        else if (y>x && y>z)
            return x+z>y;
        else
            return x+y>z;
    }
}