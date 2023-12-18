import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        String[] ary = new String[w];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < h; i++) {
            ary[i] = sc.next();
            for (int j = 0; j < 2; j++) {
                sb.append((ary[i]));
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}