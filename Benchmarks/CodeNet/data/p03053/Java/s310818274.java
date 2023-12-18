import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        Character[][] dic = new Character[h][w];
        Character[][] tmp = new Character[h][w];

        int sum = 0;

        for (int i = 0; i < h; i++) {
            String line = sc.next();
            for (int s = 0; s < w; s++) {
                dic[i][s] = line.charAt(s);
                tmp[i][s] = line.charAt(s);
                if (line.charAt(s) == '#') {
                    sum++;
                }
            }
        }

        int counter = 0;

        while (sum != h * w) {
//            Character[][] tmp = new Character[h][w];
            boolean flag = false;
            for (int i = 0; i < h; i++) {
                for (int s = 0; s < w; s++) {
//                    if (tmp[i][s] == null) {
//                        tmp[i][s] = dic[i][s];
//                    }
                    if (dic[i][s] == '#') {
                        if (0 <= i - 1) {
                            if (tmp[i-1][s] != '#') {
                                tmp[i-1][s] = '#';
                                sum++;
                                flag = true;
                            }
                        }

                        if (i + 1 < h) {
                            if (tmp[i+1][s] != '#') {
                                tmp[i+1][s] = '#';
                                sum++;
                                flag = true;
                            }
                        }

                        if (0 <= s - 1) {
                            if (tmp[i][s-1] != '#') {
                                tmp[i][s-1] = '#';
                                sum++;
                                flag = true;
                            }
                        }

                        if (s + 1 < w) {
                            if (tmp[i][s+1] != '#') {
                                tmp[i][s+1] = '#';
                                sum++;
                                flag = true;
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < h; i++) {
                for (int s = 0; s < w; s++) {
                    if (dic[i][s] == '.' && tmp[i][s] == '#') {
                        dic[i][s] = tmp[i][s];
                    }
                }
            }
//            dic = tmp;
            if (flag) counter++;
        }

        System.out.println(counter);
    }
}