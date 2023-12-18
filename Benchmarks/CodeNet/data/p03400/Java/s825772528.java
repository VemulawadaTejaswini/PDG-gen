import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int D = sc.nextInt();
        int X =sc.nextInt();
        int ans =0;
        int A[] = new int[N];
        for (int i =0;i<N;i++){
            A[i] =sc.nextInt();
        }
        for (int i=0; i<N ;i++){
            int cnt=0;
            while(cnt*A[i]+1 <= D) {
                cnt++;
                ans += 1;
            }
        }
        ans += X;
        System.out.println(ans);
    }
}