import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long n = 0, h = 0, w = 0;
        for (int i = 1; i < 3501; i++) {
            for (int j = 1; j < 3501; j++) {
                int a = N * i * j;
                int b = 4*i*j - N*i - N*j;
                if(0 < b && b < a && a % b == 0){
                    h = i; w = j; n = a/b; break;
                }
            }
        }
        System.out.println(n + " " + h + " " + w);
        sc.close();

    }

}
