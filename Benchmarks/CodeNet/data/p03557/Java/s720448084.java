import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n], c = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            c[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        long ans = 0;
        for(int i = 0; i < n; i++){
            int x = Arrays.binarySearch(a, b[i]);
            int y = Arrays.binarySearch(c, b[i]);
            if(x < 0) x = -x - 1;
            if(y < 0) y = -y - 1;
            else y++;
            y = n - y;
            ans += x * y;
        }
        System.out.println(ans);
    }
}