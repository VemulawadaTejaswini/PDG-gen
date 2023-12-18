import java.util.*;

/**
 * Created by mizuk on 2017/07/26.
 */
public class Main {
    private static int N;
    private static int M;
    private static ArrayList<Integer> a = new ArrayList<Integer>();
    private static ArrayList<Integer> b = new ArrayList<Integer>();
    private static ArrayList<Integer> a2b = new ArrayList<Integer>();
    private static ArrayList<Integer> b2a = new ArrayList<Integer>();

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
                a2b.add(b.get(i));
            }
            if(b.get(i) == N){
                b2a.add(a.get(i));
            }
        }

        for (int i : a2b){
            for (int j : b2a){
                if(a2b.get(i) == b2a.get(j)){
                    System.out.println("POSSIBLE");
                    return;
                }
            }
        }

        System.out.println("IMPOSSIBLE");
    }
}