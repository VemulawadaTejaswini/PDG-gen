import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n, r, p, c;
        Scanner scan = new Scanner(System.in);
        while((n = scan.nextInt()) != 0 && (r = scan.nextInt()) != 0) {
            int[] number = new int[n];

            for(int i=1; i<=n; i++){
                number[i-1] = i;
            }

            for (int i = 0; i < r; i++) {
                ArrayList<Integer> tmp = new ArrayList<Integer>();
                p = scan.nextInt();
                c = scan.nextInt();

                for(int j=0; j<p-1; j++){
                    tmp.add(number[n-j-1]);
                }

                for (int k = 0; k < c; k++) {
                    number[n - 1 - k] = number[n - p - k];
                }

                for(int m=0; m<p-1; m++){
                    number[n-c-m-1] = tmp.get(m);
                }
            }
            System.out.println(number[n-1]);
        }
    }
}