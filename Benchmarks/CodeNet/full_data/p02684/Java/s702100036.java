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
            int ans = arr[0];
            for (int i=1; i<k; i++) {
                int tmp = ans;
                ans = arr[tmp];
            }
            System.out.println(ans + 1);
        } else {
            long rem = (k - b) % cle;
            int ans = arr[0];
            for (int i=1; i<(int)(b+rem); i++) {
                int tmp = ans;
                ans = arr[tmp];
            }
            System.out.println(ans + 1);
        }


    }


}
