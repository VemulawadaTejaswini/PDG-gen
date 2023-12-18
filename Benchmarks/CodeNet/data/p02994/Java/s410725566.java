import java.util.*;


class Main{
    static long mod = 1000000007;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int[] ringo = new int[N];
        int result = 10000000;
        int sum = 0;
        for(int i=0;i<N;i++){
            ringo[i] = L+i;
            sum += ringo[i];
            if(Math.abs(ringo[i])<Math.abs(result))result=ringo[i];
        }
        System.out.println(sum-result);
    }
}