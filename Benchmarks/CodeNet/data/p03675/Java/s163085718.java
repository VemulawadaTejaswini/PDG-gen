import java.util.*;

/**
 * Created by mizuk on 2017/07/26.
 */
public class Main {

    private static int N;
    private static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void input(){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();

        for(int i=0;i<N;i++) {
            arrayList.add(scan.nextInt());
        }
    }

    public static void main(String args[]){
        //入力
        input();

        ArrayList<Integer> b = new ArrayList<>();

        for (int i=0;i<N;i++){
            b.add(arrayList.get(i));
            Collections.reverse(b);
        }

        for (int i=0;i<N;i++){
            System.out.print(b.get(i) + " ");
        }

    }
}
