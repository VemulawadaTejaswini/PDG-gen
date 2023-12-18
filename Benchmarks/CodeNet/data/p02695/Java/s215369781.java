import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    List<Integer> list = new ArrayList<>();
    int n = sc.nextInt();
    int m = sc.nextInt();
    int q = sc.nextInt();
    int[][] arr = new int[q][4];

    long ans = 0;

    public static void main(String[] args){
        new Main().run();
    }

    void run() {


        for (int i=0; i<q; i++) {
            arr[i][0] = sc.nextInt()-1;
            arr[i][1] = sc.nextInt()-1;
            arr[i][2] = sc.nextInt();
            arr[i][3] = sc.nextInt();
        }

        list.add(1);
        dfs(list);

//        bfs("1");

//        for (String s: list) {
//            long tmpA = 0;
//            for (int i=0; i<q; i++) {
//                int a = arr[i][0];
//                int b = arr[i][1];
//                int c = arr[i][2];
//                int d = arr[i][3];
//                if ((s.charAt(b-1)-'0')-(s.charAt(a-1)-'0') == c) {
//                    tmpA += d;
//                }
//            }
//            ans = Math.max(ans, tmpA);
//        }

//        System.out.println(list);
        System.out.println(ans);

    }

    void dfs(List<Integer> list) {
        if (list.size() == n) {
            ans = Math.max(ans, calc(list));
        } else {
            int tmp = list.get(list.size()-1);
            for (int i=tmp; i<=m; i++) {
                list.add(i);
//                System.out.println(list);
                dfs(list);
                list.remove(list.size()-1);
            }
        }
    }

    long calc(List<Integer> list) {
        long sum = 0;
        for (int i=0; i<q; i++) {
            if (list.get(arr[i][1])-list.get(arr[i][0]) == arr[i][2]) {
                sum += arr[i][3];
            }
        }
        return sum;
    }

//    void bfs(String s) {
//        Queue<String> queue = new ArrayDeque<>();
//        queue.add(s);
//        while (!queue.isEmpty()) {
//            String st = ((ArrayDeque<String>) queue).peekFirst();
//            System.out.println(st);
//            if (st.length() > n && m != 10) queue.poll();
//            int l = st.charAt(st.length()-1) - '0';
//            for (int i=l; i<=m; i++) {
//                st += String.valueOf(i);
//                if (st.length() < n) queue.add(st);
//                if (st.length() == n) list.add(st);
//                st = st.substring(0, st.length()-1);
//            }
//            queue.poll();
//        }
//    }
}
