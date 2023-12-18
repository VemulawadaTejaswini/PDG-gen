import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        int nineKeta = 0;
        int num = 0;
        for(long i = 0; i < k; i++) {
            num++;
            if(num > 9) {
                num = 1;
                nineKeta++;
            }
            String s = num+"";
            for(int j = 0; j < nineKeta; j++) {
                s += "9";
            }
            System.out.println(s);
        }
    }
}