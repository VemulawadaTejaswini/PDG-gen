import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        boolean[][] isSelected = new boolean[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int j2 = 0; j2 < b.length; j2++) {
                    if (a[i][j] == b[j2]) {
                        isSelected[i][j] = true;
                        break;
                    }
                }
            }
        }
        if ((isSelected[0][0] == true && isSelected[0][1] == true && isSelected[0][2] == true)
            || (isSelected[1][0] == true && isSelected[1][1] == true && isSelected[1][2] == true)
            || (isSelected[2][0] == true && isSelected[2][1] == true && isSelected[2][2] == true)
            || (isSelected[0][0] == true && isSelected[1][0] == true && isSelected[2][0] == true)
            || (isSelected[0][1] == true && isSelected[1][1] == true && isSelected[2][1] == true)
            || (isSelected[0][2] == true && isSelected[1][2] == true && isSelected[2][2] == true)
            || (isSelected[0][0] == true && isSelected[1][1] == true && isSelected[2][2] == true)
            || (isSelected[0][2] == true && isSelected[1][1] == true && isSelected[2][0] == true)
        ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}