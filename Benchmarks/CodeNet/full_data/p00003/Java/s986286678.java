import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data_num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < data_num; i++) {
            String[] line = sc.nextLine().split(" ");
            Arrays.sort(line);
            int a =Integer.parseInt(line[0]);
            int b =Integer.parseInt(line[1]);
            int c =Integer.parseInt(line[2]);
            if (c * c == a * a + b * b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}