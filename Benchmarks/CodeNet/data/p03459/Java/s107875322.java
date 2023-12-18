import java.util.*;
class Main{
    /*
     * 整数 -> nextInt() (遅い場合は下のni())
     * 単語 -> next()
     * 1行 -> nextLine()
     * 注意 : nextLInt()をnext(),nextInt()のあとに呼び出す場合、次が改行だと改行だけ取ってしまうので注意
     */
    final int[] dx = {1,0,-1,0};
    final int[] dy = {0,1,0,-1};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] t = new int[N];
        int[] x = new int[N];
        int[] y = new int[N];
        int nowt = 0;
        int nowx = 0;
        int nowy = 0;
        for(int i=0;i<N;i++){
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();

            int cost = Math.abs(nowx-x[i]) + Math.abs(nowy-y[i]);
            int dt = t[i] - nowt;

            if(cost > dt){
                System.out.println("No");
                return;
            }

            if((dt-cost) % 2 == 1){
                System.out.println("No");
                return;
            }

            nowt = t[i];
            nowx = x[i];
            nowy = y[i];
        }

        System.out.println("Yes");
    }
}
