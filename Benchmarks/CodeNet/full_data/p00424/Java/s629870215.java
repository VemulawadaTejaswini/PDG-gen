import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            String[][] x = new String[n][2];
            for (int i = 0; i < n; i++){
                x[i][0] = sc.next();
                x[i][1] = sc.next();
            }
            int m = sc.nextInt();
            for (int i = 0; i < m; i++){
                String s = sc.next();
                int j = 0;
                while (j < n){
                    if (s.equals(x[j][0])){
                        System.out.print(x[j][1]);
                        j = n;
                    }
                    else if (j == n - 1){
                        System.out.print(s);
                    }
                    j++;
                }
            }
            System.out.println();
            n = sc.nextInt();
        }
    }
}

