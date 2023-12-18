import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] a = new int[h+2][w+2];
        for(int i = 1; i<h+1; i++) {
            String s = sc.next();
            for(int j = 1; j<w+1; j++) {
                a[i][j] = (s.charAt(j-1) == '#')? 1: 0;
            }
        }

        for(int i = 1; i<h+1; i++) {
            for(int j = 1; j<w+1; j++) {
                if(a[i][j]==1 && a[i-1][j]
                        +a[i][j-1]+a[i][j]+a[i][j+1]
                        +a[i+1][j] <= 1) {
                    System.out.println("No");
                    return;
                }

            }
        }
        System.out.println("Yes");
    }
}