import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int setNum = Integer.parseInt(sc.nextLine());
        int inputNum = setNum * 2;
        String[][] inputSet = new String[setNum][2];
 
        int cnt = 0;
        boolean zero = true;
        while (0 < inputNum--) {
            String input = sc.nextLine();
            if(zero)
                inputSet[cnt][0] = input;
            else
                inputSet[cnt++][1] = input;
 
            zero = !zero;
        }
 
        for(int i=0; i < setNum; i++) {
            output(inputSet[i][0], inputSet[i][1]);
        }
    }
 
    public static void output(String a, String b) {
        String[] partA = slice(a);
        String[] partB = slice(b);
        String[] output = new String[10];
 
        Long carry = 0L;
        int cnt = 0;
        for(int i=0; i < 9; i++) {
            Long x = Long.valueOf(partA[i] != null ? partA[i] : "0") + Long.valueOf(partB[i] != null ? partB[i] : "0") + carry;
            String y = String.valueOf(x);
            output[i] = y.length() <= 10 ? ("0000000000".substring(y.length()) + y) : y.substring(y.length()-10);
            if(y.length() <= 10 && partA[i+1] == null && partB[i+1] == null) break;
            carry = y.length() <= 10 ? 0L : Long.valueOf(y.substring(0, y.length()-10));
            cnt++;
        }
 
        if(partA[8] != null || partB[8] != null || 8 <= cnt) {
            System.out.println("overflow");
        } else {
            for(int i=7; 0<=i; i--) {
                System.out.print(output[i] != null ? output[i] : "");
            }
            System.out.println();
        }
    }
 
    public static String[] slice(String a) {
        int len = a.length();
        String[] ret = new String[10];
        int cnt = 0;
        while(10 < len) {
            ret[cnt++] = a.substring(len-10, len);
            len = len - 10;
        }
        ret[cnt] = a.substring(0, len);
        return ret;
    }
}