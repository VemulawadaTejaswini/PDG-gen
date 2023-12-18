import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int high = 0;
        int num = -1;
        for(int i=1;i<=N;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A>high){
                high = A;
                num = B;
            }
        }
        int ans = high+num-1;
        System.out.println(ans);
    }
}