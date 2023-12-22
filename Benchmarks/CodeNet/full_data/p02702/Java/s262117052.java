import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                String sub = s.substring(i,j);
                BigInteger a = new BigInteger(sub);
                BigInteger div = new BigInteger("2019");

                if(a.remainder(div).compareTo(new BigInteger("0")) == 0){count++;}
            }
        }
        System.out.println(count);
        return;
    }
}