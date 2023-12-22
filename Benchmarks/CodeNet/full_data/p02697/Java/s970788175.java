import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n % 2 == 1) {
            for (int i = 0; i < m; i++) {
                int p = i + 1;
                int q = n - 1 - i;
                System.out.println(p + " " + q);
            }
        } else {
            for(int i = 0; i< m ; i++) {
                int d = (n/2-1) - i;
                if(d % 2 == 0) {
                    int p = 1 + (i/2);
                    int q = 1 + d + (i/2);
                    System.out.println(p + " " + q);
                } else {
                    int q = n - (i/2);
                    int p = n - d - (i/2);
                    System.out.println(p + " " + q);
                }
            }

        }

    }

}