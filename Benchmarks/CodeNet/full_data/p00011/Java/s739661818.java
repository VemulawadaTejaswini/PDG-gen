import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int w, n, a, b, i;
        int data[] = new int[30];

        w = scan.nextInt();
        n = scan.nextInt();

        for(i = 0; i < w; i++) {
            data[i] = i + 1;
        }

        for(i = 0; i < n; i++) {
            int tmp, index;
            String s = scan.next();
            index = s.indexOf(",");
            a = Integer.parseInt(s.substring(0, index)) - 1;
            b = Integer.parseInt(s.substring(index + 1)) - 1;


            tmp = data[a];
            data[a] = data[b];
            data[b] = tmp;
        }

        for(i = 0; i < w; i++) {
            System.out.println(data[i]);
        }
    }
}
