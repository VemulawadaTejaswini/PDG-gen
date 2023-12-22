import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static Pattern PATTERN_FIELD_START = Pattern.compile("\\d \\d");

    public static void main(String[] args) {
        // 読み込んでフィールドを作る
        Scanner sc = new Scanner(System.in);

        List<String> fieldInput = new ArrayList<String>();
        while (sc.hasNext()) {
            String input = sc.nextLine();
            if (PATTERN_FIELD_START.matcher(input).matches()) {
                if (fieldInput.isEmpty()) {
                    continue;
                }

                new Pachimon(fieldInput).search();
                fieldInput.clear();
            } else {
                fieldInput.add(input);
            }
        }

    }

    private static class Pachimon {
        List<List<Pos>> pachimon = new ArrayList<List<Pos>>();

        Pos s;

        Pos g;

        Pachimon(List<String> fieldInput) {
            for (int i = 0; i < 5; i++) {
                this.pachimon.add(new ArrayList<Pos>());
            }

            for (int y = 0; y < fieldInput.size(); y++) {
                String field = fieldInput.get(y);
                for (int x = 0; x < field.length(); x++) {
                    char c = field.charAt(x);

                    switch (c) {
                    case 'S':
                        this.s = new Pos(x, y);
                        break;
                    case 'G':
                        this.g = new Pos(x, y);
                        break;
                    case '1':
                        this.pachimon.get(0).add(new Pos(x, y));
                        break;
                    case '2':
                        this.pachimon.get(1).add(new Pos(x, y));
                        break;
                    case '3':
                        this.pachimon.get(2).add(new Pos(x, y));
                        break;
                    case '4':
                        this.pachimon.get(3).add(new Pos(x, y));
                        break;
                    case '5':
                        this.pachimon.get(4).add(new Pos(x, y));
                        break;

                    }

                }

            }

        }

        public void search() {

            int start = -1;
            int dist = Integer.MAX_VALUE;

            for (int i = 0; i < 5; i++) {
                int[][] dp = new int[5][1024];
                for (int h = 0; h < 5; h++) {
                    Arrays.fill(dp[h], Integer.MAX_VALUE);
                }

                int first = (i + 1) % 5;

                for (int j = 0; j < this.pachimon.get(first).size(); j++) {
                    // s→e1
                    dp[first][j] = dist(this.s, this.pachimon.get(first).get(j));
                }

                int now = first;

                for (int e = 0; e < 4; e++) {
                    now = (now + e) % 5;
                    int next = (now + 1) % 5;
                    for (int j = 0; j < this.pachimon.get(now).size(); j++) {
                        for (int k = 0; k < this.pachimon.get(next).size(); k++) {
                            dp[next][k] = Math.min(
                                    dp[next][k],
                                    dp[now][j]
                                            + dist(this.pachimon.get(now)
                                                    .get(j),
                                                    this.pachimon.get(next)
                                                            .get(k)));
                        }
                    }
                }

                now = (now + 1) % 5;
                for (int j = 0; j < this.pachimon.get(now).size(); j++) {
                    int d = dp[now][j]
                            + dist(this.pachimon.get(now).get(j), this.g);

                    if (d < dist) {
                        dist = d;
                        start = i + 1;
                    }

                }

            }
            if (start == -1) {
                System.out.println("NA");
            } else {
                System.out.println(start + " " + dist);
            }

        }
    }

    /** 場所 */
    private static class Pos {
        public int x;

        public int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int dist(Pos from, Pos to) {
        return Math.abs(from.x - to.x) + Math.abs(from.y - to.y);
    }

}