import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();;
        int x = inp.nextInt();

        while(n != 0){
            int total = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = i+1; j <= n; j++) {
                    int k = x - i - j;
                    if(k > j && k <= n) {
                        total++;
                    }

                }
            }

            System.out.println(total);

            n = inp.nextInt();
            x = inp.nextInt();
        }
    }
}

