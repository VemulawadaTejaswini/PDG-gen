import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    List<String> list = new ArrayList<>();
    int n = sc.nextInt();
    int m = sc.nextInt();
    int q = sc.nextInt();
    int[] adds = new int[n];


    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        int[][] arr = new int[q][4];

        for (int i=0; i<q; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
            arr[i][3] = sc.nextInt();
        }

//        dfs();

        bfs("1");

        long ans = 0;

        for (String s: list) {
            long tmpA = 0;
            for (int i=0; i<q; i++) {
                int a = arr[i][0];
                int b = arr[i][1];
                int c = arr[i][2];
                int d = arr[i][3];
                if ((s.charAt(b-1)-'0')-(s.charAt(a-1)-'0') == c) {
                    tmpA += d;
                }
            }
            ans = Math.max(ans, tmpA);
        }

//        System.out.println(list);
        System.out.println(ans);

    }

    void dfs() {

    }

    void bfs(String s) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add(s);
        while (!queue.isEmpty()) {
            String st = ((ArrayDeque<String>) queue).peekFirst();
//            System.out.println(st);
            if (st.length() > n) queue.poll();
            int l = st.charAt(st.length()-1) - '0';
            for (int i=l; i<=m; i++) {
                st += String.valueOf(i);
                if (st.length() < n) queue.add(st);
                if (st.length() == n) list.add(st);
                st = st.substring(0, st.length()-1);
            }
            queue.poll();
        }
    }
}
