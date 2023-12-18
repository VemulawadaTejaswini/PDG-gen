import java.util.*;

public class Main {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String x = sc.nextLine();
            int l = x.length();
            int numBeginningT = 0;
            int numLastS = 0;
            if (x.charAt(0) == 'T') {
                numBeginningT = x.split("S")[0].length();
            }
            if (x.charAt(x.length()-1) == 'S') {
                String[] s = x.split("T");
                numLastS = s[s.length-1].length();
            }
            int numS = l/2 - numLastS;
            int numT = l/2 - numBeginningT;
            
            System.out.println(numBeginningT + Math.abs(numS - numT) + numLastS);
    }
}