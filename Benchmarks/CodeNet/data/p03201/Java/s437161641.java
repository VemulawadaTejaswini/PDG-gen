import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int[] x = new int[n];
        Arrays.fill(x, 0);
        int max = 0;
        for(int i = 1; i < n; i++){
            if(a[i-1] >= a[i]){
                if(x[a[i] - 1] == max){
                    x[a[i] - 1] = ++max;
                }
                else{
                    x[a[i] - 1] = x[a[i] - 1] + 1;
                }
            }
            else continue;
        }
        System.out.println(++max);
    }
}