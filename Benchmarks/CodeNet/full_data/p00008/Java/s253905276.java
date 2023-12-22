import java.util.Scanner;

public class Main {
    public static int number;
    public static int res;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            number = sc.nextInt();
            res = 0;
            for (int i = 0; i < 10; i++) {
                calc(i, 0, 1);
            }
            System.out.println(res);
        }
    }
    public static void calc(int index, int sum, int rep) {
        sum += index;
        if (rep == 4) {
            if (sum == number) {
                res++;
            }
            return;
        }
        
        for (int i = 0; i < 10; i++) {
            calc(i, sum, rep + 1);
        }
    }
}