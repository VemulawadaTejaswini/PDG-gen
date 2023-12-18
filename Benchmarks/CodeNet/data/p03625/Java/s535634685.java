import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        int max1 = 0, max2 = 0;
        int i = n-1;
        while(max2 == 0 && i > 0){
            if(a[i] == a[i-1]){
                if(max1 == 0) max1 = a[i];
                else max2 = a[i];
                i--;
            }
            i--;
        }
        System.out.println(max1 * max2);
    }
}