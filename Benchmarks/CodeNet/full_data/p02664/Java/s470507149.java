import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        char[] arr = sc.next().toCharArray();

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == '?') {
                arr[i] = 'D';
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<arr.length; i++) {
            sb.append(arr[i]);
        }

        System.out.println(sb.toString());


    }
}
