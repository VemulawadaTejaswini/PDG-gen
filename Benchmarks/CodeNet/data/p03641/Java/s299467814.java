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

    public static void search(ArrayList<Integer> array){
        int min;
        int min_index;
        int array_min_index;
        int second_min = 10000000;
        int second_min_index = 0;

        // 最小値と最小値のインデックス
        min = Collections.min(array);
        array_min_index = array.indexOf(min);
        min_index = p.indexOf(min);

        //System.out.println("min:"+min);
        //System.out.println("min_index:"+min_index);

        // 最小値より後ろの値の個数が偶数なら最小値の次に小さい値を探索
        if( (p.size() - min_index) % 2 == 1) {
            array.remove(array_min_index);
            search(array);
            return;
        }else{
            // 最小値以降の最小値を探索
            p.remove(min_index);
            for(int i=min_index;i<p.size();i+=2){   //1個とばしでループ
                if(p.get(i) < second_min){
                    second_min = p.get(i);
                    second_min_index = i;
                }
            }
        }

        queue.add(min);
        queue.add(second_min);
        p.remove(second_min_index);

        return;
    }

    public static void main(String args[]){
        //入力
        input();

        ArrayList<Integer> temp = (ArrayList<Integer>) p.clone();

        for(int i=0;i<N/2;i++){
            search(temp);
            temp = p;
            /*for (int j : p){
                System.out.print(j + " ");
            }
            System.out.println();
            for (int j : queue){
                System.out.print(j + " ");
            }
            System.out.println();
            */
        }

        // 答えの表示
        for (int i : queue){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}