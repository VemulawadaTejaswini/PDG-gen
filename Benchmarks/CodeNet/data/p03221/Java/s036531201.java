import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int MOD = (int)998244353;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer>[] lists = new ArrayList[n];

        for (int i=0; i<n; i++) lists[i] = new ArrayList<>();

        int[][] arr = new int[m][2];

        for (int i=0; i<m; i++) {
            int a = sc.nextInt() - 1;
            int num = sc.nextInt();
            lists[a].add(num);
            arr[i][0] = a;
            arr[i][1] = num;
        }

        for (int i=0; i<n; i++) {
            Collections.sort(lists[i]);
        }

//        System.out.println(lists[0]);

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<m; i++) {
            int a = arr[i][0];
            int num = arr[i][1];
            num = lists[a].indexOf(num) + 1;
            a += 1;
            String str = "";
            str += String.format("%06d", a);
            str += String.format("%06d", num);
            sb.append(str + "\n");
        }

        System.out.println(sb.toString());


    }
}

