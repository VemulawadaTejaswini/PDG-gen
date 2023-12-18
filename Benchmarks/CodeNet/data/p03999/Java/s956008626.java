import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println( solve(S) );
    }

    private static long solve(String S) {
        Result result = solve_rec(S);
        return result.sum;
    }

    private static Result solve_rec(String s) {
        if( s.length() == 1 ) return new Result(1, Long.parseLong(s));

        long times = 1;
        long sum = Long.parseLong(s);
        for (int i = 1; i < s.length(); i++) {
            String head = s.substring(0, i);
            String tail = s.substring(i);
            Result result = solve_rec(tail);

            times += result.times;
            sum += Long.parseLong(head) * result.times + result.sum;
        }
        return new Result(times, sum);
    }

    private static class Result {
        private final long times;
        private final long sum;

        public Result(long times, long sum) {
            this.times = times;
            this.sum = sum;
        }
    }
}