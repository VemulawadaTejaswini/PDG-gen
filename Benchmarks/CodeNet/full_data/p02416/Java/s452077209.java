import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        String str;
        while(true) {
            str = scn.next();
            if(str.length() == 1 && str.charAt(0) == '0') {
                break;
            }
            System.out.println(calcSum(str));
        }
    }
    
    public static int calcSum(String str) {
        int c = 0;
        char[] ary = str.toCharArray();
        for(char elm : ary) {
            c += Integer.parseInt(elm + "");
        }
        return c;
    }
}