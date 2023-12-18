import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int H = Integer.parseInt(sc.next());
        final int W = Integer.parseInt(sc.next());
        char S[][] = new char[H][W];
        for (int i=0; i<H; i++) {
            S[i] =  sc.next().toCharArray();
        }
        sc.close();
        int T[][] = new int[H][W];

        outside: for (int i=0; i<H; i++) {
            for (int j=0; j<W; j++) {
                if ('.'==S[i][j]) {
                    T[i][j] = 1;
                    break outside;
                }
            }
        }
        for (int cnt=1; cnt<H*W; cnt++) {
            for (int i=0; i<H; i++) {
                for (int j=0; j<W; j++) {
                    if (S[i][j]=='.' && T[i][j]==0) {
                        if (i>0 && T[i-1][j]==cnt)
                            T[i][j] = cnt + 1;
                        if (i<H-1 && T[i+1][j]==cnt)
                            T[i][j] = cnt + 1;
                        if (j>0 && T[i][j-1]==cnt)
                            T[i][j] = cnt + 1;
                        if (j<W-1 && T[i][j+1]==cnt)
                            T[i][j] = cnt + 1;
                    }
                }
            }
        }
        int max1 = 1;
        int max2 = 1;
        for (int i=0; i<H; i++) {
            for (int j=0; j<W; j++) {
                if (i>0 && i<H-1 && j>0 && j<W-1)
                    continue;
                if (i==0 && j==0) {
                    if (T[i+1][j]<T[i][j] && T[i][j+1]<T[i][j]) {
                        if (T[i][j] >= max2 && max2 >= max1) {
                            max1 = max2;
                            max2 = T[i][j];
                        } else if (max2 >= T[i][j] && T[i][j] >= max1) {
                                max1 = T[i][j];
                        }
                    }
                } else if (i==0 && j==W-1) {
                    if (T[i+1][j]<T[i][j] && T[i][j-1]<T[i][j]) {
                        if (T[i][j] >= max2 && max2 >= max1) {
                            max1 = max2;
                            max2 = T[i][j];
                        } else if (max2 >= T[i][j] && T[i][j] >= max1) {
                            max1 = T[i][j];
                        }
                    }
                } else if (i==H-1 && j==0) {
                    if (T[i-1][j]<T[i][j] && T[i][j+1]<T[i][j]) {
                        if (T[i][j] >= max2 && max2 >= max1) {
                            max1 = max2;
                            max2 = T[i][j];
                        } else if (max2 >= T[i][j] && T[i][j] >= max1) {
                            max1 = T[i][j];
                        }
                    }
                } else if (i==H-1 && j==W-1) {
                    if (T[i-1][j]<T[i][j] && T[i][j-1]<T[i][j]) {
                        if (T[i][j] >= max2 && max2 >= max1) {
                            max1 = max2;
                            max2 = T[i][j];
                        } else if (max2 >= T[i][j] && T[i][j] >= max1) {
                            max1 = T[i][j];
                        }
                    }
                } else if (i==0) {
                    if (T[i+1][j]<T[i][j] && T[i][j-1]<T[i][j] && T[i][j+1]<T[i][j]) {
                        if (T[i][j] >= max2 && max2 >= max1) {
                            max1 = max2;
                            max2 = T[i][j];
                        } else if (max2 >= T[i][j] && T[i][j] >= max1) {
                            max1 = T[i][j];
                        }
                    }
                } else if (i==H-1) {
                    if (T[i-1][j]<T[i][j] && T[i][j-1]<T[i][j] && T[i][j+1]<T[i][j]) {
                        if (T[i][j] >= max2 && max2 >= max1) {
                            max1 = max2;
                            max2 = T[i][j];
                        } else if (max2 >= T[i][j] && T[i][j] >= max1) {
                            max1 = T[i][j];
                        }
                    }
                } else if (j==0) {
                    if (T[i+1][j]<T[i][j] && T[i-1][j]<T[i][j] && T[i][j+1]<T[i][j]) {
                        if (T[i][j] >= max2 && max2 >= max1) {
                            max1 = max2;
                            max2 = T[i][j];
                        } else if (max2 >= T[i][j] && T[i][j] >= max1) {
                            max1 = T[i][j];
                        }
                    }
                } else if (j==W-1) {
                    if (T[i+1][j]<T[i][j] && T[i-1][j]<T[i][j] && T[i][j-1]<T[i][j]) {
                        if (T[i][j] >= max2 && max2 >= max1) {
                            max1 = max2;
                            max2 = T[i][j];
                        } else if (max2 >= T[i][j] && T[i][j] >= max1) {
                            max1 = T[i][j];
                        }
                    }
                }
            }
        }

//        for (int i=0; i<H; i++) {
//            for (int j=0; j<W; j++) {
//                System.out.print(T[i][j]);
//            }
//            System.out.println();
//        }
        System.out.println(max1 + max2 - 2);
    }
}