import java.util.*;

/**
 * Created by mizuk on 2017/07/26.
 */
public class Main {
    private static int N;
    private static ArrayList<Integer> p = new ArrayList<Integer>();
    private static Queue<Integer> queue = new ArrayDeque<Integer>();

    public static void input(){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();

        for(int i=0;i<N;i++) {
            p.add(scan.nextInt());
        }
    }

    public static ArrayList<Integer> search(ArrayList<Integer> array){
        int min = 10000000;
        int min_index = 0;
        int second_min = 10000000;

        // 最小値の探索
        for(int i : array){
            if(array.get(i) < min){
                min = array.get(i);
                min_index = i;
            }
        }

        // 最小値より後ろの値の個数が偶数なら最小値の次に小さい値を探索
        if( (N - min_index) % 2 == 1) {
            array.remove(min_index);
            search(array);
        }else{
            // 最小値以降の最小値を探索
            for(int i=min_index+1;i<N;i++){
                second_min = Math.min(second_min , array.get(i));
            }
        }

        queue.add(min);
        queue.add(second_min);
        p.remove(min);
        p.remove(second_min);

        return p;
    }

    public static void main(String args[]){
        //入力
        input();

        ArrayList<Integer> temp = new ArrayList<>();

        for(int i=0;i<N/2;i++){
            temp = search(temp);
        }

        for (int i : queue){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}