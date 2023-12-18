import java.util.*;
class Main{
    /*
     * 整数 -> nextInt() (遅い場合は下のni())
     * 単語 -> next()
     * 1行 -> nextLine()
     * 注意 : nextLIneをnext(),nextInt()のあとに呼び出す場合、次が改行だと改行だけ取ってしまうので注意
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long x = sc.nextLong();
        long[] A = new long[(int)N];
        for(int i=0;i<N;i++) A[i] = sc.nextLong();
        Arrays.sort(A);
        for(int i=1;i<N;i++){
            A[i] += A[i-1];
        }
        for(int i=0;i<N;i++){
            if(A[i] == x){
                System.out.println(i+1);
                return;
            }
            if(A[i] > x){
                System.out.println(i);
                return;
            }
        }
        System.out.println(N-1);
    }
}
