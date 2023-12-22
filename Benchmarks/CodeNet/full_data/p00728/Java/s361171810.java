import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int n = sc.nextInt();
            if(n == 0) break;
            int[] s = new int [n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextInt();
            }
            Arrays.sort(s);
            int ave = 0;
            for(int i = 1;i<n-1;i++)
            {
                ave += s[i];
            }
            ave /= (n-2);
            System.out.println(ave);
        }

        sc.close();
    }
    
    public static void printary(int[] a)
    {
        for ( int i = 0; i < a.length; i++) {
            if(i>0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
