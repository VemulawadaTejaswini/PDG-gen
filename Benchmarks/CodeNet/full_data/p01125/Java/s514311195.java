import java.util.Scanner;

class Main {
    public static int check_gem(int[][] gem_locs, int gem_amount, int x, int y, int collected_count) {
        for (int k = 0; k < gem_amount; k++) {
            if (gem_locs[0][k] == x && gem_locs[1][k] == y) {
                collected_count++;
                // System.out.println("Found a gem at (" + x + " " + y + ")!");
            }
        }
        return collected_count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gem_amount;
        int inst_amount;
        int robot_x;
        int robot_y;
        int collected_count;

        while (true) {
            collected_count = 0;
            robot_x = 10;
            robot_y = 10; // initialize

            // set location of gems and instructions
            gem_amount = scan.nextInt();
            if (gem_amount == 0)
                break;
            int[][] gem_locs = new int[2][gem_amount];
            for (int i = 0; i < gem_amount; i++) {
                gem_locs[0][i] = scan.nextInt();
                gem_locs[1][i] = scan.nextInt();
            }

            inst_amount = scan.nextInt();
            String[] insts_direction = new String[inst_amount];
            int[] insts_distance = new int[inst_amount];
            for (int i = 0; i < inst_amount; i++) {
                insts_direction[i] = scan.next();
                insts_distance[i] = scan.nextInt();
            }

            // gem collection
            collected_count = check_gem(gem_locs, gem_amount, robot_x, robot_y, collected_count);
            for (int i = 0; i < inst_amount; i++) {
                if ("N".equals(insts_direction[i])) {
                    for (int j = 0; j < insts_distance[i]; j++) {
                        robot_y++;
                        // System.out.println("Robot is at " + robot_x + " " + robot_y);
                        collected_count = check_gem(gem_locs, gem_amount, robot_x, robot_y, collected_count);
                    }
                } else if ("E".equals(insts_direction[i])) {
                    for (int j = 0; j < insts_distance[i]; j++) {
                        robot_x++;
                        // System.out.println("Robot is at " + robot_x + " " + robot_y);
                        collected_count = check_gem(gem_locs, gem_amount, robot_x, robot_y, collected_count);
                    }
                } else if ("S".equals(insts_direction[i])) {
                    for (int j = 0; j < insts_distance[i]; j++) {
                        robot_y--;
                        // System.out.println("Robot is at " + robot_x + " " + robot_y);
                        collected_count = check_gem(gem_locs, gem_amount, robot_x, robot_y, collected_count);
                    }
                } else if ("W".equals(insts_direction[i])) {
                    for (int j = 0; j < insts_distance[i]; j++) {
                        robot_x--;
                        // System.out.println("Robot is at " + robot_x + " " + robot_y);
                        collected_count = check_gem(gem_locs, gem_amount, robot_x, robot_y, collected_count);
                    }
                }
            }

            // print result
            if (collected_count == gem_amount) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}