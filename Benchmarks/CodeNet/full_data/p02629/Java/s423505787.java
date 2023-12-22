
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] pow26 = new long[13];
        for(int i=1;i<13;i++){
            pow26[i] = pow26[i-1] + (long) Math.pow(26, i);
        }
        int length = 0;
        for(int i=0;i<13;i++){
            if(n > pow26[i] && n <= pow26[i+1]){
                length = i+1;
                break;
            }
        }
        //length=桁数
        int x = (int) (n % 26);
        x = x == 0 ? 26 : x;
        String s = String.valueOf((char)(x+96));
        n -= 26;
        for(int i=1;i<length;i++){
            int y = (int)((n % Math.pow(26, i+1) / Math.pow(26, i))) + 1;
            s = String.valueOf((char)(y+96)) + s;
            n -= Math.pow(26, i+1);
        }
        System.out.println(s);

    }
}
