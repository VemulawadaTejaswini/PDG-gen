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
        int N = sc.nextInt();

        int ans = Integer.MAX_VALUE;
        for(int a=1;a<N;a++){
            int b = N - a;

            int c = sum(a) + sum(b);
            ans = Math.min(ans,c);
        }
        System.out.println(ans);
    }

    public static int sum(int x){
        int ret = 0;
        while(x>0){
            ret += x%10;
            x /= 10;
        }
        return ret;
    }
}
