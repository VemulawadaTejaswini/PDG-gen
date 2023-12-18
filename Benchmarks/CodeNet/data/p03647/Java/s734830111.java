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
            if(a.get(i) == 1){
                a2b.add(b.get(i));
            }
            if(b.get(i) == N){
                b2a.add(a.get(i));
            }
        }
    }

    public static void main(String args[]){
        //入力
        input();

        for (int i=0;i<a2b.size();i++){
            if(b2a.contains(a2b.get(i))){
                System.out.println("POSSIBLE");
                return;
            }
        }

        System.out.println("IMPOSSIBLE");
    }
}