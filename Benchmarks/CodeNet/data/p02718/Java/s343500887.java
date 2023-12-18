import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int sum = 0;

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        for (int i=0; i<n; i++) sum += arr[i];

        double compare = (double)sum/(double)(4*m);

//        System.out.println(compare);

        int cnt = 0;

        for (int i=0; i<n; i++) {
            if ((double)arr[i]>=compare) cnt++;
        }

        if (cnt>=m) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }


    }

}
