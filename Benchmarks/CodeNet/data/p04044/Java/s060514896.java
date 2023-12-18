import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] arr = new String[n];
        for (int i=0; i<n; i++) arr[i] = sc.next();

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) sb.append(arr[i]);

        System.out.println(sb.toString());

    }

}

