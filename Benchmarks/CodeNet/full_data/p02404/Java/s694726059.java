import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        while(true) {
            int n = num.nextInt();
            int m = num.nextInt();
            if (n == 0 && m == 0) break;
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= m; j++){
                    if(i == 1 || j == 1 || i == n || j == m ){
                        System.out.print("#");
                    }
                    else {
                        System.out.print(".");
                    }
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
    }
}
