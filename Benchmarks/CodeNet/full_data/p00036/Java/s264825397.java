import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int[][] map = new int[28][28];

            for (int i = 0; i < 28; i++) {
                for (int j = 0; j < 28; j++) {
                    map[i][j] = -1;
                }
            }

            for (int i = 10; i < 18; i++) {
                String S = sc.next();

                int index = 0;
                for (int j = 10; j < 18; j++) {
                    map[i][j] = Integer.parseInt(S.split("")[index]);
                    index++;
                }
            }

            System.out.println(check(map));
        }
    }

    private static String check(int[][] map) {
        for (int i = 10; i < 18; i++) {
            for (int j = 10; j < 18; j++) {
                if (map[i][j] == 1) {
                    if (map[i][j+1] == 1 && map[i+1][j] == 1 && map[i+1][j+1] == 1) {
                        return "A";
                    }

                    if (map[i+1][j] == 1 && map[i+2][j] == 1 && map[i+3][j] == 1) {
                        return "B";
                    }

                    if (map[i][j+1] == 1 && map[i][j+2] == 1 && map[i][j+3] == 1) {
                        return "C";
                    }

                    if (map[i+1][j] == 1 && map[i+1][j-1] == 1 && map[i+2][j-1] == 1) {
                        return "D";
                    }

                    if (map[i][j+1] == 1 && map[i+1][j+1] == 1 && map[i+1][j+2] == 1) {
                        return "E";
                    }

                    if (map[i+1][j] == 1 && map[i+1][j+1] == 1 && map[i+2][j+1] == 1) {
                        return "F";
                    }

                    if (map[i][j+1] == 1 && map[i+1][j] == 1 && map[i+1][j-1] == 1) {
                        return "G";
                    }
                }
            }
        }
        return "Z";
    }
}