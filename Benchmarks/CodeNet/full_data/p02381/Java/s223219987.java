import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            
            int n = sc.nextInt();
            if(n == 0)break;
            int[] s = new int[n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextInt();
            }
            double average = 0;

            for (int i = 0; i < n; i++) {
                average += s[i]; 
            }
            average /= n;
            double alpha2 = 0;
            for (int i = 0; i < n; i++) {
                alpha2 += (s[i] -average) * (s[i] -average);
            }
            alpha2 /= n;
            System.out.println(Math.sqrt(alpha2) );
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
