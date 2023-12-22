import java.math.BigDecimal;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long size = s.length();
        BigDecimal num2019 = BigDecimal.valueOf(2019);
        int count = 0;
        for(int i = 0; i<size + 1; i++){
            for(int j =i; j<size + 1; j++){
                String str = s.substring(i,j);
                if(str.equals(""))
                    continue;
                if(str.length() >= 19) {
                    BigDecimal num = new BigDecimal(s.substring(i, j));
                    if (num.remainder(num2019).equals(BigDecimal.ZERO)) {
                        count++;
                    }
                }else{
                    long num = Long.parseLong(s.substring(i,j));
                    if(num % 2019 == 0){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

}
