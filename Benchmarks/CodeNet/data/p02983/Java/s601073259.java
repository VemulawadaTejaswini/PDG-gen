import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ins = sc.nextLine().split(" ");
        int l = Integer.parseInt(ins[0]);
        int r = Integer.parseInt(ins[1]);
        int diff = l % 2019;
        if(diff == 0){
            System.out.println(0);
            return;
        }
        int rdiff = 2019 - diff;
        if(r >= l + rdiff) {
            System.out.println(0);
        }
        int result = Integer.MAX_VALUE;
        for(int i = l; i < r;i++) {
            for(int j = l + 1 ; j <= r; j++) {
                int tmp = i*j;
                tmp = tmp % 2019;
                result = Math.min(result, tmp);
            }
        }
        System.out.println(result);
    }
}