import java.math.BigDecimal;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int lol = 0;
        BigDecimal bd_673 = new BigDecimal(673);
        BigDecimal bd_0 = new BigDecimal(0);
        for(int loop = 0;loop < a.length();loop++){
            for(int loop2 = loop+1;loop2 <= a.length();loop2++){
                String s = a.substring(loop,loop2);
                BigDecimal bd = new BigDecimal(s);
                if(bd.remainder(bd_673).compareTo(bd_0)==0){
                    lol++;
                }
            }
        }
        System.out.println(lol);
    }
}