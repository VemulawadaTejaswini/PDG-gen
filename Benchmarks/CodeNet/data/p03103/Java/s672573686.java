import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] val = new int[N][2];
        for(int i = 0; i < N; i++){
            String[] T = sc.nextLine().split(" ");
            int a = Integer.parseInt(T[0]);
            int b = Integer.parseInt(T[1]);
            val[i][0] = a;
            val[i][1] = b;
        }
        Arrays.sort(val, (a, b) -> Integer.compare(a[0], b[0]));
        long ans = 0;
        for(int i = 0; M > 0; i++){
            long a = val[i][0];
            long b = val[i][1];
            if(val[i][1] < M){
                ans += a * b;
                M -= b;
            }else{
                ans += a * M;
                M = 0;
            }
        }
        System.out.println(ans);
    }
}