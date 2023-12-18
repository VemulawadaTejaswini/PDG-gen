import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] m = new int[N];
        for(int i = 0; i < N; i++){
            m[i] = sc.nextInt();
        }

        int remain = X;
        int min = 1100;
        for(int i = 0; i < N; i++){
            remain -= m[i]; 
            min = Math.min(min, m[i]);
        }

        int ans = 0;
        if(remain == 0) ans = m.length;
        else ans = (remain - (remain % min)) / min + m.length;
        System.out.println(ans);
    }
}