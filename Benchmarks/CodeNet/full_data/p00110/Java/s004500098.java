import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String line = sc.nextLine();
            int plusPos = line.indexOf('+');
            int equalPos = line.indexOf('=');
            String leftOp = line.substring(0, plusPos);
            String rightOp = line.substring(plusPos + 1, equalPos);
            String answerOp = line.substring(equalPos + 1);
            int res = -1;
            int start = 0;
            if((leftOp.length() > 0 && leftOp.charAt(0) == 'X') || (rightOp.length() > 0 && rightOp.charAt(0) == 'X') || (answerOp.length() > 0 && answerOp.charAt(0) == 'X'))
                start = 1;
            for(int i = start; i <= 9; i++) {
                BigInteger l = new BigInteger(leftOp.replace("X", Integer.toString(i)));
                BigInteger r = new BigInteger(rightOp.replace("X", Integer.toString(i)));
                BigInteger a = new BigInteger(answerOp.replace("X", Integer.toString(i)));
                if(a.equals(l.add(r))) res = i;
            }
            if(res == -1) System.out.println("NA");
            else System.out.println(res);
        }
    }
}