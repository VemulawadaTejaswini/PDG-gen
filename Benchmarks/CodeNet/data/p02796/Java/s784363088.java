import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Robot[] robots = input();
        Arrays.sort(robots);
        Robot pre = robots[0];
        int result = 1;
        for (int i = 1; i < robots.length; i++) {
            if (pre.rpos <= robots[i].lpos) {
                pre = robots[i];
                result++;
            } else if (pre.lpos <= robots[i].lpos && robots[i].rpos <= pre.rpos) {
                pre = robots[i];
            }
        }
        System.out.println(result);
    }

    static Robot[] input() {
        Scanner s = new Scanner(System.in);
        Robot[] robots = new Robot[Integer.parseInt(s.nextLine())];
        for (int i = 0; i < robots.length; i++) {
            robots[i] = new Robot(s.nextLine());
        }
        return robots;
    }

    static class Robot implements Comparable<Robot> {
        int x, lpos, rpos;
        Robot(String input) {
            String[] split = input.split(" ");
            x = Integer.parseInt(split[0]);
            int length = Integer.parseInt(split[1]);
            lpos = x - length;
            rpos = x + length;
        }
        public int compareTo(Robot robot) {
            if (x > robot.x) {
                return 1;
            } else if (x < robot.x) {
                return -1;
            }
            return 0;
        }
    }
}