import java.util.*;

public class Main{
    public static void main(String[] args) {
        double num = 0.006;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int T = sc.nextInt();
        int A = sc.nextInt();
        sc.nextLine();
        int num2 = Integer.MAX_VALUE;
        int tmp;
        int ans = 0;
        for(int i = 0; i < N; i++){
            tmp = sc.nextInt();
            tmp = T*1000 - tmp*6;
            tmp = Math.abs(A*1000 - tmp);
            if(tmp < num2){
                num2 = tmp;
                ans = i+1;
            }
        }
        System.out.println(ans);
    }
}