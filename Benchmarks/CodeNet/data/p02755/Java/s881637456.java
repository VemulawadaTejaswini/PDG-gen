import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> c = new ArrayList<>();
        for (int i = 1; true; i++) {

            if (Math.floor(i * 0.08) > a) {
                break;
            } else if (Math.floor(i * 0.08) == a) {
                c.add(i);
            }
        }

        List<Integer> d = new ArrayList<>();
        for (int i = 1; true; i++) {

            if (Math.floor(i * 0.1) > b) {
                break;
            } else if (Math.floor(i * 0.1) == b) {
                d.add(i);
            }
        }

        int answer = -1;
        for (int i = 0; i < c.size(); i++) {
            if (answer != -1) {
                break;
            }
            for (int j = 0; j < d.size(); j++) {
                if (c.get(i) == d.get(j)) {
                    answer = c.get(i);
                    break;
                }
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
