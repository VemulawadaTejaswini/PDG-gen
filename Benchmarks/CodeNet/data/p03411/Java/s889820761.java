import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {
    static int N;
    static pair[] map;


    static class pair implements Comparable{
            public int a;
            public int b;
            public boolean c;

            pair(){
                this.a = 0;
                this.b = 0;
                this.c = false;
            }

            pair(int a, int b, boolean c){
                this.a = a;
                this.b = b;
                this.c = c;
            }

            public void set(int a, int b, boolean c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }

        @Override
        public int compareTo(Object o) {
            pair aite = (pair)o;
            if(this.a > aite.a)return 1;
            if(this.a < aite.a)return -1;
            if(this.b > aite.b)return 1;

            return 0;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        map = new pair[2 * N];

        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            map[i] = new pair(a, b, false);
        }
        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            map[i + N] = new pair(a, b, true);
        }

        Arrays.sort(map);
        boolean[] temp = new boolean[N];
        ArrayList<pair> a  = new ArrayList<>();

        int ans = 0;
        for (int i = 0; i < 2 * N; i++) {
            if(map[i].c == false){
                // Aの時
                a.add(map[i]);
            }else{
                // Bの時
                int max = -1;
                int maxj = -1;

                for (int j = 0; j < a.size(); j++) {
                    if(a.get(j).b < map[i].b && max < a.get(j).b){
                        max = a.get(j).b;
                        maxj = j;
                    }

                }
                if(maxj != -1){
                    ans++;
                    a.remove(maxj);
                }
            }
        }

        System.out.println(ans);


    }
}