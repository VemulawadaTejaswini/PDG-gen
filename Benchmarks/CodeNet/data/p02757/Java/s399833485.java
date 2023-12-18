import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int P = sc.nextInt();
        int k = 0;
        String str = sc.next();
            for (int i = 0; i <= N; i++) {
                for (int j = 0; j <= N; j++) {
                    if (j <= i) {
                    } else {
                        long a = Integer.parseInt(str.substring(i, j));
                        if (a % P == 0) {
                            k = k + 1;
                        }

                    }
                }
            }
            System.out.println(k);
        } /*else if (9 < P || P < 100) {
            for (int i = 0; i <= N; i++) {
                for (int j = 0; j < N; j++) {
                    if (j <= i) {
                    } else {
                        long a = Integer.parseInt(str.substring(i, j + 1));
                        if (a % P == 0) {
                            k = k + 1;
                        }

                    }
                }
            }
            System.out.println(k);


        } else if (99 < P || P < 1000) {
            for (int i = 0; i <= N; i++) {
                for (int j = 0; j < N - 1; j++) {
                    if (j <= i) {
                    } else {
                        long a = Integer.parseInt(str.substring(i, j + 2));
                        if (a % P == 0) {
                            k = k + 1;
                        }

                    }
                }
            }
            System.out.println(k);
        } else if (999 < P || P <= 10000) {
            for (int i = 0; i <= N; i++) {
                for (int j = 0; j < N-2; j++) {
                    if (j <= i) {
                    } else {
                        long a = Integer.parseInt(str.substring(i, j + 3));
                        if (a % P == 0) {
                            k = k + 1;
                        }

                    }
                }
            }
            System.out.println(k);*/
        }

    