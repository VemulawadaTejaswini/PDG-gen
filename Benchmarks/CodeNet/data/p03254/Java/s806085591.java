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

        int ans = 0;
        for(int i=0;i<N;i++){
            if(x >= A[i]){
                ans++;
                x -= A[i];
            }
        }
        if(x > 0) ans--;
        ans = Math.max(0,ans);
        System.out.println(ans);
    }
}
