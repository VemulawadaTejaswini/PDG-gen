import java.util.*;
import java.math.*;
class Main
 {
	public static void main (String[] args)
	 {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s == "7") {
            System.out.println("1");
            return;
        }
        BigInteger s_value = new BigInteger(s);
        char c = s.charAt(s.length() - 1);
        if(c == '0' || c == '2' || c == '4' || c == '5' || c == '6' || c == '8') {
            System.out.println("-1");
            return;
        }
        int v = s.charAt(s.length() - 1) - '0';
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i < 10; i++) {
            map.put((v*i) % 10, i);
            // System.out.println((v*i) % 10 + "->" + i);
        }
        int req = 7;
        BigInteger res = new BigInteger("0");
        BigInteger extraMultiplier = new BigInteger("1");
        BigInteger ten = new BigInteger("10");
        BigInteger temp;
        while(true) {
            // System.out.println("req: " + req);
            int multiplier = map.get(req);
            temp = s_value.multiply(extraMultiplier).multiply(new BigInteger(Integer.toString(multiplier)));
            res = res.add(temp);
            extraMultiplier = extraMultiplier.multiply(ten);
            req = check(res);
            if(req == -1) {
                break;
            }
        }
        System.out.println(res.toString().length());
	 }
     public static int check(BigInteger res) {
        String s = res.toString(10);
        // System.out.println(s);
        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if(c != '7') {
                if((c - '0') < 7) {
                    return 7 - (c - '0');
                }
                else {
                    return 17 - (c - '0');
                }
            }
        }
        return -1;
     }
}