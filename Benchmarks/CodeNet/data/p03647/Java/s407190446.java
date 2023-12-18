import java.util.*;

/**
 * Created by mizuk on 2017/07/26.
 */
public class Main {
    private static int N;
    private static int M;
    private static ArrayList<Integer> a = new ArrayList<Integer>();
    private static ArrayList<Integer> b = new ArrayList<Integer>();

    public static void input(){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();

        for(int i=0;i<M;i++) {
            a.add(scan.nextInt());
            b.add(scan.nextInt());
        }
    }

    public static void main(String args[]){
        //入力
        input();

        for(int i=0;i<a.size();i++){
            if(a.get(i) == 1){
                for(int j=0;j<a.size();j++){
                    if(b.get(i) == a.get(j) && b.get(j) == N){
                        System.out.println("POSSIBLE");
                        return;
                    }
                }
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}