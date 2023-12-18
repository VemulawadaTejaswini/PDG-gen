import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        int r;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        r = a[n-1] / 2;
        int r_index = 0;;

        int i = 1;

        r_index = Arrays.binarySearch(a, r);
        if(r_index >= 0){
            r = a[r_index];
        }else{
            r_index = -r_index - 1;
            if(r_index != 0 && r_index != n){
                r = ( ( Math.abs( a[n-1] / 2 - a[r_index] ) ) < Math.abs( ( a[r_index - 1] - a[n-1] / 2) ) ) ?  a[r_index] : a[r_index - 1];
            }else if(r_index == 0){
                r = a[r_index];
            }else{
                r = a[r_index - 1];
            }
        }

        System.out.println(a[n-1] + " " + r);
    }
}