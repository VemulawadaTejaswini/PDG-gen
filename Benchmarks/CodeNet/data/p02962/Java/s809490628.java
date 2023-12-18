import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String a = stdR.readLine();
        String b = stdR.readLine();
        if(a.length() >= b.length()) {
            String a2 = a + a;
            int max = a2.length() / b.length();
            String kensyo = "";
            int amax = 0;
            int acount = 0;
            for(int i = 0 ; i < a.length() - b.length() + 1; i++) {
                kensyo += a.substring(i, i + b.length());
                if(kensyo.equals(b)) {
                    amax++;
                    i += b.length() - 1;
                }else {
                    acount = Math.max(amax, acount);
                    amax = 0;
                }
                kensyo = "";
            }
            acount = Math.max(amax, acount);
            
            int a2max = 0;
            int a2count = 0;
            for(int i = 0 ; i < a2.length() - b.length() + 1 ; i++) {
                kensyo += a2.substring(i, i + b.length());
                if(kensyo.equals(b)) {
                    a2max++;
                    i += b.length() - 1;
                }else {
                    a2count = Math.max(a2max, a2count);
                    a2max = 0;
                }
                kensyo = "";
            }
            a2count = Math.max(a2max, a2count);
            if(a2count == max) {
                if(a2count != 0) {
                    System.out.println(-1);
                }else {
                    System.out.println(0);
                }
            }else {
                System.out.println(a2count);
            }
        }else {
            int max = b.length() / a.length() + ((b.length() % a.length()) == 0 ? 0 : 1);
            int counter = 1;
            String astr = a;
            while(counter != max) {
                a += astr;
                counter++;
            }
            
            String a2 = a + a;
            max = a2.length() / b.length();
            String kensyo = "";
            int amax = 0;
            int acount = 0;
            for(int i = 0 ; i < a.length() - b.length() + 1; i++) {
                kensyo += a.substring(i, i + b.length());
                if(kensyo.equals(b)) {
                    amax++;
                    i += b.length() - 1;
                }else {
                    acount = Math.max(amax, acount);
                    amax = 0;
                }
                kensyo = "";
            }
            acount = Math.max(amax, acount);
            
            int a2max = 0;
            int a2count = 0;
            for(int i = 0 ; i < a2.length() - b.length() + 1 ; i++) {
                kensyo += a2.substring(i, i + b.length());
                if(kensyo.equals(b)) {
                    a2max++;
                    i += b.length() - 1;
                }else {
                    a2count = Math.max(a2max, a2count);
                    a2max = 0;
                }
                kensyo = "";
            }
            a2count = Math.max(a2max, a2count);
            if(a2count == max) {
                if(a2count != 0) {
                    System.out.println(-1);
                }else {
                    System.out.println(0);
                }
            }else {
                System.out.println(a2count);
            }
        }
        
    }
}