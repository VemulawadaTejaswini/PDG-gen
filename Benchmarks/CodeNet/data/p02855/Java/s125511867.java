import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        String[][] s = new String[h][w];
        Map<Integer, Integer> height = new HashMap<>();
        for (int i = 0; i < h; i++) {
            s[i] = sc.next().split("");
        }
        String[][] ans = new String[h][w];
        for (int i = 0; i < h; i++) {
            Arrays.fill(ans[i], "1");
        }

        int num = 1;
        boolean hfirst = true;
        for (int i = 0; i < h; i++) {
            boolean hasSb = false;
            for (int j = 0; j < w; j++) {
                if ("#".equals(s[i][j])) {
                    hasSb = true;
                    break;
                }
            }
            if (hasSb) {
                if (hfirst) {
                    hfirst = false;
                    continue;
                }
                if (num == 1) {
                    height.put(num, i);
                }
                num++;
            }
            height.put(num, height.getOrDefault(num, 0) + 1);
            for (int j = 0; j < w; j++) {
                ans[i][j] = String.valueOf(num);
            }
        }

        int hstart = 0;
        for (int i = 1; i <= height.size(); i++) {
            boolean wfirst = true;
            int wstart = 0;
            if (i == 1) {
                boolean hasSb = false;
                for (int j = 0; j < height.get(i); j++) {
                    for (int l = 0; l < w; l++) {
                        if ("#".equals(s[j][l])) {
                            hasSb = true;
                            hstart = j;
                            break;
                        }
                    }
                    if (hasSb) {
                        break;
                    }
                }
            }
            for (int j = 0; j < w; j++) {
                if (!"#".equals(s[hstart][j])) {
                    continue;
                }
                if (wfirst) {
                    wfirst = false;
                    continue;
                }
                if (wstart == 0) {
                    wstart = j;
                    continue;
                }
                num++;
                if (i == 1) {
                    for (int l = 0; l < height.get(i); l++) {
                        for (int m = wstart; m < j; m++) {
                            ans[l][m] = String.valueOf(num);
                        }
                    }
                } else {
                    for (int l = hstart; l < hstart + height.get(i); l++) {
                        for (int m = wstart; m < j; m++) {
                            ans[l][m] = String.valueOf(num);
                        }
                    }
                }
                wstart = j;
            }
            if (!wfirst && wstart != 0) {
                num++;
                if (i == 1) {
                    for (int l = 0; l < height.get(i); l++) {
                        for (int m = wstart; m < w; m++) {
                            ans[l][m] = String.valueOf(num);
                        }
                    }
                } else {
                    for (int l = hstart; l < hstart + height.get(i); l++) {
                        for (int m = wstart; m < w; m++) {
                            ans[l][m] = String.valueOf(num);
                        }
                    }
                }
            }
            if (i == 1) {
                hstart = 0;
            }
            hstart += height.get(i);
        }

        for (int i = 0; i < h; i++) {
            StringJoiner sj = new StringJoiner(" ");
            for (int j = 0; j < w; j++) {
                sj.add(ans[i][j]);
            }
            System.out.println(sj);
        }
    }

}
