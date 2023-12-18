import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        char[][] s = new char[h][w];
        for (int i = 0 ; i < h ; i++) {
            String t = sc.next();
            for (int j = 0 ; j < w ; j++) {
                s[i][j] = t.charAt(j);
            }
        }
        int ans[][] = new int[h][w];
        int count = 1;
        for (int i = 0 ; i < h ; i++) {
            int c = 0;
            for (int j = 0 ;j < w ; j++) {
                if (s[i][j] == '#') {
                    c++;
                }
            }
            if (c == 0) {
                if (i == 0) {
                    for (int j = 0 ; j < w ; j++) {
                        ans[i][j] = count;
                    }
                } else {
                    for (int j = 0 ; j < w ; j++) {
                        ans[i][j] = ans[i - 1][j];
                    }
                }

            }

            if (c == 1 && count > 1) {
                count++;
                for (int j = 0 ; j < w ; j++) {
                    ans[i][j] = count;
                }
            }
            if (c == 1 && count == 1) {
                for (int j = 0 ; j < w ; j++) {
                    ans[i][j] = count + 1;
                }
                count++;
            }
            if (c >= 2) {
                int[] d = new int[w];
                int temp = 0;
                for (int j = 0 ; j < w ; j++) {
                    if (s[i][j] == '#') {
                        temp++;

                    }
                    d[j] = temp;
                }
                for (int j = 0 ; j < w ; j++) {
                    if (d[j] == 0) {
                        d[j] = 1;
                    }
                }

                for (int j = 0 ; j < w ; j++) {
                    ans[i][j] = count + d[j];
                }

                if (i >= 1) {
                    int e = 0;
                    int ind = 1;
                    while (e == 0 && i - ind >= 0) {
                        for (int j = 0 ; j < w ; j++) {
                            if (s[i - ind][j] == '#') {
                                e++;
                            }
                        }
                        if (e == 0) {
                            ind++;
                        }

                    }

                    for (int l = 1 ; l < ind ; l++) {
                        for (int j = 0 ; j < w ; j++) {
                            ans[i - l][j] = ans[i][j];
                        }
                    }



                }

                count += temp;
            }

        }


        for (int i = 0 ; i < h ; i++) {
            for (int j = 0 ; j < w ; j++) {
                if (k == 1) {
                    System.out.print(ans[i][j]+ " ");
                } else {
                    System.out.print(ans[i][j] - 1+ " ");
                }

            }
            System.out.print("\n");
        }
    }

}
