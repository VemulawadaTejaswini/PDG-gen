import java.util.Scanner;

public class Main {
    // return true if xy1 is farer
    static boolean isFarer(int[] xy1, int[] xy2) {
        double dist2 = (Math.pow(xy1[0], 2) + Math.pow(xy1[1], 2)) - (Math.pow(xy2[0], 2) + Math.pow(xy2[1], 2));
        if (dist2 > 0)
            return true;
        else if (dist2 < 0)
            return false;

        return xy1[0] > xy2[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] pos;
        int[] treasure;
        int[] move;
        for (int j = 0; j < n; j++){
            pos = new int[2];
            treasure = new int[2];
            move = new int[2];
            while (true) {
                String[] line = sc.nextLine().split(" ");
                for (int i = 0; i < 2; i++) {
                    move[i] = Integer.parseInt(line[i]);
                }

                if (move[0] == 0 && move[1] == 0)
                    break;

                pos[0] = pos[0] + move[0];
                pos[1] = pos[1] + move[1];

                if (isFarer(pos, treasure)) {
                    System.arraycopy(pos, 0, treasure, 0, 2);
                }

            }
            System.out.println(treasure[0] + " " + treasure[1]);
        }
    }
}