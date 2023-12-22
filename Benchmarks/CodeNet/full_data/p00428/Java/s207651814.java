import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        while ((n > 0) && (m > 0)){
            int[] x = new int[m];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++){
                    int a = sc.nextInt();
                    if (a == 1){
                        x[j]++;
                    }
                }
            }
            for (int i = 0; i < m; i++){
                int max = -1;
                int tmp = 0;
                for (int j = 0; j < m; j++){
                    if (x[j] > max){
                        max = x[j];
                        tmp = j + 1;
                    }
                }
                System.out.print(tmp);
                x[tmp - 1] = -2;
                if (i < m - 1){
                    System.out.print(" ");
                }
                else {
                    System.out.println();
                }
            }
            n = sc.nextInt();
            m = sc.nextInt();
        }
    }
}
