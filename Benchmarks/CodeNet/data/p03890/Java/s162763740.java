import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[(int)Math.pow(2, n)];
        for(int i = 0; i < a.length; i++) a[i] = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < Math.pow(2, n-i); j += 2){
                a[j/2] = Math.abs(a[j] - a[j+1]);
            }
        }
        System.out.println(a[0]);
    }
}