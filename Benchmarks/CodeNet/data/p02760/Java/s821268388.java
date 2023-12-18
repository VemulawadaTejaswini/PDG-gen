import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] a = new int[3][3];
        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                a[i][j] = Integer.parseInt(sc.next());
            }
        }
        int n = Integer.parseInt(sc.next());
        for(int i = 0; i < n; ++i) {
            int b = Integer.parseInt(sc.next());
            for(int j = 0; j < 3; ++j) {
                for(int k = 0; k < 3; ++k) {
                    if(a[j][k] == b) {
                        a[j][k] = -1;
                        j = 5;
                        break;
                    }
                }
            }
        }

        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                if(a[j][i] != -1) {
                    break;
                }

                if(j == 2) {
                    System.out.println("Yes");
                    return;
                }
            }
        }

        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                if(a[i][j] != -1) {
                    break;
                }

                if(j == 2) {
                    System.out.println("Yes");
                    return;
                }
            }
        }

        for(int i = 0; i < 3; ++i) {
            if(a[i][i] != -1) {
                break;
            }

            if(i == 2) {
                System.out.println("Yes");
                return;
            }
        }

        for(int i = 1; i < 3; ++i) {
            if(a[i][2 - i] != -1) {
                break;
            }

            if(i == 2) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}