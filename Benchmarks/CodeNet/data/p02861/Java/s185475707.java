import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] map = new int[n][2];
        for (int i = 0; i< n; i++) {
            map[i][0] = scanner.nextInt();
            map[i][1] = scanner.nextInt();
        }
        
        double ave = 0;
        
        for (int i0 = 0; i0 < n; i0++) {
            for (int i1 = 0; i1 < n; i1++) {
                if (i0 != i1) {
                    ave += getDcu(map[i0], map[i1]);
                }
                if (n > 2 && i0 != i1) {
                    for (int i2 = 0; i2 < n; i2++) {
                        if (i0 != i2 && i1 != i2) {
                            ave += getDcu(map[i1], map[i2]);
                            if (n > 3) {
                                for (int i3 = 0; i3 < n; i3++) {
                                    if (i0 != i3 && i1 != i3 && i2 != i3) {
                                        ave += getDcu(map[i2], map[i3]);
                                        if (n > 4) {
                                            for (int i4 = 0; i4 < n; i4++) {
                                                if (i0 != i4 && i1 != i4 && i2 != i4 && i3 != i4) {
                                                    ave += getDcu(map[i3], map[i4]);
                                                    if (n > 5) {
                                                        for (int i5 = 0; i5 < n; i5++) {
                                                            if (i0 != i5 && i1 != i5 && i2 != i5 && i3 != i5 && i4 != i5) {
                                                                ave += getDcu(map[i4], map[i5]);
                                                                if (n > 6) {
                                                                    for (int i6 = 0; i6 < n; i6++) {
                                                                        if (i0 != i6 && i1 != i6 && i2 != i6 && i3 != i6 && i4 != i6 && i5 != i6) {
                                                                            ave += getDcu(map[i5], map[i6]);
                                                                            if (n == 8) {
                                                                                for (int i7 = 0; i7 < n; i7++) {
                                                                                    if (i0 != i7 && i1 != i7 && i2 != i7 && i3 != i7 && i4 != i7 && i5 != i7 && i6 != i7) {
                                                                                        ave += getDcu(map[i6], map[i7]);
                                                                                   }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        ave = ave / getKai(n);
        System.out.println(ave);
        
    }
    
    
    private static int getKai(int i) {
        if (i == 1) {
            return 1;
        }
        return getKai(i - 1) * i;
    }
    
    
    private static double getDcu(int[] pos1, int[] pos2) {
        return Math.sqrt((pos1[0] - pos2[0]) * (pos1[0] - pos2[0]) + (pos1[1] - pos2[1]) * (pos1[1] - pos2[1]));
    }
}
