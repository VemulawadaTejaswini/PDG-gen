import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        
        if(n==0)
        {
            System.out.println(0);
        }
        else
        {
        System.out.println(a[n-1]-a[0]);
        }
    }
}