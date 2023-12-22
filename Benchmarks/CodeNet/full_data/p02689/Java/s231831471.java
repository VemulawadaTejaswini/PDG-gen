import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    Set<Integer> list = new HashSet<>();

//    List<Integer>[] lists = new ArrayList[n];

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

//        for (int i=0; i<n; i++) lists[i] = new ArrayList<>();

        int[] h = new int[n];

        for (int i=0; i<n; i++) {
            h[i] = sc.nextInt();
        }

        for (int i=0; i<m; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            if (h[a] < h[b]) list.add(a);
            else if (h[b] < h[a]) list.add(b);
            else {
                list.add(a);
                list.add(b);
            }
        }

        System.out.println(n - list.size());

//        for (int i=0; i<m; i++) {
//            int a = sc.nextInt()-1;
//            int b = sc.nextInt()-1;
//            lists[a].add(b);
//            lists[b].add(a);
//        }

        int cnt = 0;

//        for (int i=0; i<n; i++) {
//            int base = h[i];
//
//        }
    }
}
