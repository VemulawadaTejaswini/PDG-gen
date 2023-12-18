import java.util.*;
class Main
{
    static int[][] c;
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        a[3] = sc.nextInt();
        Arrays.sort(a);
        String ans = (a[0] == 1 && a[1] == 4 && a[2] == 7 && a[3] == 9)? "YES" : "NO";
        System.out.println(ans);
    }
}