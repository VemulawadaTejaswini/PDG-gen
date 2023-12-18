import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int n = Integer.parseInt(line);

        String ballStr = scanner.nextLine();
        String[] ballStrs = ballStr.split(" ");
        int[] balls = new int[n];
        int i = 0;
        for (String ballS : ballStrs) {
            balls[i++] = Integer.parseInt(ballS);
        }

        int[] map = new int[n + 1];
        //Map<Integer, Integer> map = new HashMap<>();
        for (int ball : balls) {
            //map.put(ball, map.getOrDefault(ball, 0) + 1);
            map[ball]++;
        }

        int total = 0;

        for (int key : map) {
            if (key > 1) {
                total += key * (key - 1) / 2;
            }
//            int count = map.get(key);
//            total += count * (count - 1) / 2;
        }

        for (int ball : balls) {
//            int count = map.get(ball);
            int count = map[ball];
            System.out.println(total - (count - 1));
        }
    }
}