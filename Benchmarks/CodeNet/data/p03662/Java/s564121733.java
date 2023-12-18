import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by mizuk on 2017/07/26.
 */
public class Main {

    private static int N;
    private static int map[][];

    public static void input(){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        map = new int[N][N];

        int x , y;
        for(int i=0;i<N-1;i++) {
            x = scan.nextInt();
            y = scan.nextInt();
            // 無向グラフ
            map[y - 1][x - 1] = 1;
            map[x - 1][y - 1] = 1;
        }
    }

    public static void bfs(ArrayList<Integer> fennec , ArrayList<Integer> snuke){
        //  Fennecの番
        ArrayList<Integer> next_fennec = new ArrayList<>();
        for(int i=0;i<fennec.size();i++) {
            for (int j = 0; j < N; j++) {
                if (map[fennec.get(i)][j] == 1) {
                    map[fennec.get(i)][j] = 2;
                    map[j][fennec.get(i)] = 2;
                    next_fennec.add(j);
                }
            }
        }
        //  Snukeの番
        ArrayList<Integer> next_snuke = new ArrayList<>();
        for (int i=0;i<snuke.size();i++){
            for (int j=0;j<N;j++){
                if(map[snuke.get(i)][j] == 1){
                    if(map[fennec.get(i)][j] == 2){
                        map[snuke.get(i)][j] = 0;
                        map[j][snuke.get(i)] = 0;
                    }
                    else{
                        map[snuke.get(i)][j] = 3;
                        map[j][snuke.get(i)] = 3;
                        next_snuke.add(j);
                    }
                }
            }
        }

        if(next_fennec.isEmpty() && next_snuke.isEmpty()) return;
        else bfs(next_fennec , next_snuke);
    }

    public static void main(String args[]){
        //入力
        input();

        ArrayList<Integer> fennec_array = new ArrayList<>();
        fennec_array.add(0);
        ArrayList<Integer> snuke_array = new ArrayList<>();
        snuke_array.add(N-1);
        bfs(fennec_array , snuke_array);

        // mapの表示 & 勝敗判定
        int fennec_count = 0;
        int snuke_count = 0;
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                if(map[i][j] == 2) fennec_count++;
                if(map[i][j] == 3) snuke_count++;
                //System.out.print(map[i][j] + " ");
            }
            //System.out.println();
        }

        if(fennec_count > snuke_count) System.out.println("Fennec");
        else System.out.println("Snuke");

    }
}
