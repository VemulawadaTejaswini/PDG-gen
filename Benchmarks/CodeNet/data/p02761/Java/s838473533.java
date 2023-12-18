import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        int N = Integer.parseInt(lines[0]);
        int M = Integer.parseInt(lines[1]);

        boolean oo = false;

        String[] sample = new String[N];
        for (int i = 0; i < N; i++) {
            sample[i] = "a";
        }

        String result = "";

        for (int i = 0; i < M; i++) {
            String[] line = sc.nextLine().split(" ");
            int s = Integer.parseInt(line[0]);
            String c = line[1];
            if (!sample[s - 1].equals("a") && !sample[s - 1].equals(c)) {
                result = "-1";
                oo = true;
                break;
            }

            sample[s - 1] = c;
        }

        sc.close();

        if (!oo) {

            StringBuilder sb = new StringBuilder();
            if (sample[0].equals("0")) {
                result = "-1";
            } else {
                if (sample[0].equals("a") && sample.length > 1) {
                    sample[0] = "1";
                }
                for (int i = 0; i < N; i++) {
                    sb.append(sample[i]);
                }
                result = sb.toString().replaceAll("a", "0");
            }
        }

        if (result.equals("0")) {
            result = "-1";
        }

        System.out.println(result);
    }
}