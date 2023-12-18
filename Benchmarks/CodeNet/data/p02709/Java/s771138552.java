import java.util.*;
import java.util.Collections;
public class Main {
    static int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Integer[] b=new Integer[n/2];
        Integer[] c=new Integer[n-n/2];
        int d[]=new int[n];
        for(int i=0;i<n/2;i++)
        {
            b[i]=a[i];
        }
        for(int i=(n-n/2);i<n;i++)
        {
            c[i-n/2]=a[i];
        }
        Arrays.sort(b, Collections.reverseOrder());
        Arrays.sort(c, Collections.reverseOrder());
        for(int i=0;i<n-n/2;i++)
        {
            d[i]=c[i];
        }
        for(int i=0;i<n/2;i++)
        {
            d[c.length+i]=b[i];
        }
        long hap=0;
        for(int i=0;i<n;i++)
        {
            hap+=a[i]*Math.abs((i-binarySearch(d,a[i])));
        }
        System.out.println(hap);
    }
}
