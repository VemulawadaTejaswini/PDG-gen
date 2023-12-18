import java.util.*;
class Main
{
    static long mod = 1000000007;
    static long[] p = new long[1000001];
    String yes = "Yes";
    String no = "No";
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] x = new int[10000001];
        x[s] = 1;
        int cnt = 1;
        while(true){
            cnt++;
            if(s % 2 == 0){
                s /= 2;
            }
            else{
                s = s * 3 + 1;
            }
            if(x[s] == 1){
                System.out.println(cnt);
                break;
            }
            x[s] = 1;
        }
    }
}