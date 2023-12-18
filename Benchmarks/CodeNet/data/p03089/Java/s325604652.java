import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n+1];
        b[0] = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++){
            b[i] = sc.nextInt();
            if(b[i] > i){
                System.out.println(-1);
                return;
            }
        }
        Arrays.sort(b);
        for(int i = 1; i <= n; i++){
            System.out.println(b[i]);
        }
    }
}