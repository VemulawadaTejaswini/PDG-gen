import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        long[] a = new long[T];
        long[] b = new long[T];
        long[] c = new long[T];
        long[] d = new long[T];
        String[] ans = new String[T];

        for(int i = 0; i < T; i++){
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();
            c[i] = sc.nextLong();
            d[i] = sc.nextLong();
 //           ans[i] = "Yes";
        }

        for(int i = 0; i < T; i++){
            if(a[i] < b[i] || a[i] < b[i] || b[i] > d[i]) ans[i] = "No";
            else{
                a[i] %= b[i];
                long x = c[i] / b[i];
                a[i] += x * b[i];

                for(int j = 0; j < 100000; j++){
                    a[i] += d[i];
                    if(a[i] < b[i]){
                        ans[i] = "No";
                        break;
                    }
                    a[i] %= b[i];
                    if(a[i] > c[i]){
                        ans[i] = "No";
                        break;
                    }
                    else if(a[i] == c[i] || a[i] == 0 || b[i] == d[i]){
                        ans[i] = "Yes";
                    }
                }
            }
            System.out.println(ans[i]);
        }
    }
}
