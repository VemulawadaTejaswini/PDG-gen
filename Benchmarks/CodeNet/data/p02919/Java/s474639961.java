import java.util.Scanner;

public class Main {
    static int[] P = new int[100001];
    static int[] Map = new int[100001];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int sum=0;
        for(int i=1;i<=N;i++){
            P[i] = sc.nextInt();
            Map[P[i]] = i;
        }
        for(int A=N-1; A>0; A--){
//            System.out.println(A);
            int index = Map[A];
            int l=index-1;
            while(l > 0 && P[l] < A){
                l--;
            }
            if(l == 0){}//L側終了。
            else {
                int largest = P[l];
                int lb = l-1;
                while(lb > 0 && P[lb] < A) {
                    lb--;
                }
                lb++;
//                if(lb == 0){lb++;}
                //(l-lb+1) *
                int rb=index+1;
                while (rb <= N && P[rb] < A){
                    rb++;
                }
                rb--;
                if(rb == N+1){rb--;}//L側終了。
                //*(rb-index+1)

                sum += (l-lb+1) * (rb-index+1) * A;
            }

            int r=index+1;
            while(r <= N && P[r] < A){
                r++;
            }
            if(r == N+1){}//R側に親を探せなかった。
            else{
                int largest = P[r];
                int rb = r+1;
                while(rb <= N && P[rb] < A){
                    rb++;
                }
                rb--;
//                if(rb == N+1){rb--;}
                //(rb-r+1) *

                int lb = index-1;
                while(lb > 0 && P[lb] < A){
                    lb--;
                }
                lb++;
                if(lb == 0){lb++;}
                // * (index-lb+1)
                sum += (rb-r+1) * (index-lb+1) * A;
            }
//            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
