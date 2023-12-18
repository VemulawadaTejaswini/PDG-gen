import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0 ;i < N; i++){
            a[i] = Math.abs(sc.nextInt() - X);
        }

        for(int i = 1; i < N; i++){
            a[i] = Yuu(Math.max(a[i], a[i-1]), Math.min(a[i], a[i-1]));
        }
        System.out.println(a[N-1]);

    }

    public static int Yuu (int a, int b)
    {
        int res = 1;
        while(a > 1 && b > 1){
            a %= b;
            if(a == 0){
                res = b;
            }
            else if(a == 1){
                res = 1;
            }
            else{
                int c = a;
                a = b;
                b = c;
            }
        }
        return res;
    }
}