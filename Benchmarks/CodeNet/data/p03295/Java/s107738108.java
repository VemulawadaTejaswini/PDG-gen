import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

    static int N;
    static int M;
    static int A;
    static long B;
    static long C;
//    static int[][] map;
    static int min = 9999999;
    static int[] moto = new int[3];

    static class pair implements Comparable{
            public int a;
            public int b;

            pair(){
                this.a = 0;
                this.b = 0;
            }

            pair(int a, int b){
                this.a = a;
                this.b = b;
            }

            public void set(int a, int b) {
                this.a = a;
                this.b = b;
            }

        @Override
        public int compareTo(Object o) {
            pair aite = (pair)o;

            if(this.b > aite.b)return 1;
            if(this.b < aite.b)return -1;
            return  0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();

        pair[] map = new pair[M];

        for (int i = 0; i < M; i++) {
            map[i] = new pair();
            map[i].a = scanner.nextInt();
            map[i].b = scanner.nextInt();
        }

        Arrays.sort(map);
//        System.out.println(map[0].a);

//        for (int i = 0; i < M; i++) {
//            System.out.println(map[i].a + " == " + map[i].b);
//        }

        int ans = 0;

        for (int i = 0; i < M; i++) {
            ans++;
            int now = map[i].b;
//            System.out.println(now);
            while(true){
                if(i >= M || map[i].a >= now){
//                    System.out.println("asdf");
                    i--;
                    break;
                }
                i++;
            }
        }

        System.out.println(ans);



    }




}

