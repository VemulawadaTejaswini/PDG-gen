import java.math.BigDecimal;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        long l = Long.parseLong(s.split(" ")[0]);
        long r = Long.parseLong(s.split(" ")[1]);

        if(l / 2019 == r / 2019){
            r %= 2019;
        } else if(l / 2019 + 1 == r / 2019){
            r = 2019 + (r % 2019);
        } else {
            r = (2019 * 2) + (r % 2019);
        }
        l %= 2019;

        long[] temp = new long[8000];
        for(int i = 0; i < temp.length; i++){
            temp[i] = 10000;
        }

        int cnt = 0;
        for(long i = l; i <= r && i <= l + 8000; i++){
            temp[cnt++] = i % 2019;
        }

        Arrays.sort(temp);

        System.out.println(temp[0] * temp[1]);
        return;
    }
}
