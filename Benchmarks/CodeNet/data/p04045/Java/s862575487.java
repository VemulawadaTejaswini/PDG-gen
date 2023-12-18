import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();

        int[] num = new int[10];

        for (int i = 0;i < k; i++) {
            int a = s.nextInt();
            num[a]=1;
        }
        Integer op = n;
        while(!chechk(num,op)) {
            op++;
        }
        System.out.println(op);
    }

    private static boolean chechk(int[] num, Integer op) {
        while(op > 0) {
            if (num[op % 10] == 1) return false;
            op /= 10;
        }
        return true;
    }
