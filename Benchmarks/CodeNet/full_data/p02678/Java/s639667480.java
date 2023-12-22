import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> cave = new ArrayList<>();
        //i番目の部屋は(i-1])に対応

        for (int i = 0; i < n; i++) {
            //Listを作って代入、だと上手くいかないので先に空のListをN個入れておく
            cave.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            cave.get(a - 1).add(b - 1);//caveのa-1番目の要素にb-1というintを代入
            cave.get(b - 1).add(a - 1);
        }

        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            dist[i] = -1;//全部屋見つかってない状態に初期化
        }

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(0);//まず1番目の部屋番号をキューに入れる

        System.out.println(queue);
        int a = 0;
        while (!queue.isEmpty()) {
            int num = queue.pollLast();//キューの一番下の値をget
            System.out.println(queue);
            for (int k : cave.get(num)) {//そのキューに繋がってる部屋番号でfor文回す
                if (dist[k] == -1) {//部屋にまだ行ってなかった場合の処理
                    queue.addFirst(k);//その番号をキューの一番上に代入
                    dist[k] = num + 1;//看板を立てる
                }
            }
        }



        System.out.println("Yes");
                for(int i = 1 ; i < n ; i++){
        System.out.println(dist[i]);
        }
    }
}
