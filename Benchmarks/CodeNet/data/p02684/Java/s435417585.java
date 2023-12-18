import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt() - 1;

        int[] move = new int[n];
        Arrays.fill(move, -1);

        int cle = 1;
        int b = 0;
        int v = 0;
        int cnt = 0;

        while (move[v] == -1) {
            move[v] = cnt++;
            v = arr[v];
        }

        cle = cnt - move[v];
        b = move[v];

//        System.out.println(cle);
//        System.out.println(b);

        if (k < b) {
            int u = 0;
            for (int i=0; i<k; i++) {
                u = arr[u];
            }
            System.out.println(u + 1);
        } else {
            long rem = (k - b) % cle;
            int u = 0;
            for (int i=0; i<b+rem; i++) {
                u = arr[u];
            }
            System.out.println(u + 1);
        }


    }


}
