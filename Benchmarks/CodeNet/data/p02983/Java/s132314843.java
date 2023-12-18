import java.math.BigDecimal;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        long l = Integer.parseInt(s.split(" ")[0]);
        long r = Integer.parseInt(s.split(" ")[1]);

        long[] temp = new long[5000];
        for(int i = 0; i < temp.length; i++){
            temp[i] = 10000;
        }

        int cnt = 0;
        for(long i = l; i <= r && i <= l + 5000; i++){
            temp[cnt++] = i % 2019;
        }

        Arrays.sort(temp);

        System.out.println(temp[0] * temp[1]);
        return;
    }
}
