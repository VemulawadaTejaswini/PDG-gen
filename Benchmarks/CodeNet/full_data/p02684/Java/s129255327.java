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

        move[0] = 0;

        int tmp = 0;
        int circle = 0;
        int bef = 0;

        for (int i=1; i<n; i++) {
            int next = arr[tmp];
            if (move[next] == -1) {
                move[next] = i;
                tmp = next;
            } else {
                circle = i - move[next];
                bef = move[next];
//                System.out.println(i);
//                System.out.println(move[next]);
                break;
            }
        }

//        System.out.println(circle);
//        System.out.println(bef);

        long remain = (k - bef) % circle;

        int ans = arr[0];
        int t = arr[0];
        for (int i=1; i<bef+remain; i++) {
            t = arr[ans];
            ans = t;
        }
        System.out.println(ans + 1);


    }


}
