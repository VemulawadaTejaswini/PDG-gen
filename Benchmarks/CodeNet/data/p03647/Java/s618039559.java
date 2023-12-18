import java.util.*;

/**
 * Created by mizuk on 2017/07/26.
 */
public class Main {
    private static int N;
    private static int M;
    private static ArrayList<Integer> a = new ArrayList<Integer>();
    private static ArrayList<Integer> b = new ArrayList<Integer>();
    private static boolean from[];
    private static boolean to[];

    public static void input(){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();

        from = new boolean[M];
        to = new boolean[M];

        for(int i=0;i<M;i++) {
            a.add(scan.nextInt());
            b.add(scan.nextInt());
            if(a.get(i) == 1){
                from[b.get(i)] = true;
            }
            if(b.get(i) == N){
                to[a.get(i)] = true;
            }
        }
    }

    public static void main(String args[]){
        //入力
        input();

        for (int i=0;i<N;i++){
            if(from[i] && to[i]){
                System.out.println("POSSIBLE");
                return;
            }
        }

        System.out.println("IMPOSSIBLE");
    }
}