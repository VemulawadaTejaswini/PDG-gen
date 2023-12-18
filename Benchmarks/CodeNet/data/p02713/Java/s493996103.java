import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        
        int k = sn.nextInt();
        int num = 0;
        int sum = 0;

        for(int a = k; a > 0; a--) {
            for(int b = k; b > 0; b--) {
                for(int c = k; c > 0; c--) {
                    for(int i = c; i > 0; i--) {
                        if((a % i) == 0 && (b % i) == 0 && (c % i) == 0) {
                            num = i;
                            break;
                        }
                    }
                    sum += num;
                }
            }
        }
        System.out.print(sum);
    }
}
