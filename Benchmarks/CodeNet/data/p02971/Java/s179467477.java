import java.util.*;

public class Main{
    public static void main(String[] args){
    //入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int max = 0;
        int second = 0;
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            if(A[max]<A[i]){
                max = i;
            }
            else if(A[max] = A[i]){
                second = i;
            }
            else if(A[second]<A[i]){
                second = i;
            }
        }
    //処理
        for (int i=0;i<N;i++){
            System.out.println((i==max)?A[second]:A[max]);
        }
        sc.close();

    }
}
