import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1s = scanner.nextLine().split(" ");

        int N = Integer.valueOf(input1s[0]);
        int M = Integer.valueOf(input1s[1]);

        List<Result> resultList = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String[] input2s = scanner.nextLine().split(" ");
            int p = Integer.valueOf(input2s[0]);

            Result r = resultList.stream().filter(x -> x.p == p).findFirst().orElse(null);
            if (r == null) {
                r = new Result();
                r.p = p;
            }
            r.calc(input2s[1]);
        }

        if (resultList.size() == 0) {
            System.out.println("0 0");
        } else {
            long ac = resultList.stream().filter(x -> x.ac == 1).count();
            long wa = resultList.stream().mapToInt(x -> x.wa).sum();
            
            System.out.println(ac + " " + wa);
        }

    }

    private static class Result {
        public int p = -1;
        private int ac = 0;
        private int wa = 0;

        public void calc(String s) {
            if (ac == 0) {
                if (s.equals("AC")) {
                    ac++;
                } else {
                    wa++;
                }
            }
        }
    }
}