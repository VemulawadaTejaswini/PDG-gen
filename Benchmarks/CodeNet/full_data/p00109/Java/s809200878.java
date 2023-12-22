import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 
class Main {
     
    private static String context;
    private static int pos;
     
    public Main() {
        this.context = "";
        this.pos = 0;
    }
     
    public static void setContext(String exp) {
        context = exp;
    }
 
    private static double fact() { 
        if( context.charAt(pos) == '(' ) {
            ++pos;
            double p = expression();
            ++pos;
            return p;
        } else {
            int sp = pos;
            while( pos < context.length() && ( ( '0' <= context.charAt(pos) && context.charAt(pos) <= '9' ) || context.charAt(pos) == '.' ) ) {
                ++pos;
            }
            String q = context.substring(sp, pos);
            return Double.parseDouble(q);
        }
    }
     
    private static double term() {
        double p = fact();
        while( pos < context.length() ) {
            char c = context.charAt(pos);
            if( c =='*' ) {
                ++pos;
                p *= fact();
            } else if( c == '/' ) {
                ++pos;
                //p /= (int)fact();
		p = (int)(p / (int)fact());
            } else {
                break;
            }
        }
        return p;
    }
     
    private static double expression() {
        double p = term();
        while( pos < context.length() ) {
            char c = context.charAt(pos);
            if( c == '+' ) {
                ++pos;
                p += term();
            } else if( c == '-' ) {
                ++pos;
                p -= term();
            } else {
                break;
            }
        }
        return p;
    }
     
    public static double eval(String exp) {
        context = removeSpace(exp);
        pos = 0;
        return expression();
    }
     
    private static String removeSpace(String s) {
        String t = "";
        for(int i=0;i<s.length();++i) {
            char c = s.charAt(i);
            if( c == ' ') {
                continue;
            } 
            t += c;
        }
        return t;
    }
     
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;++i) {
            String s = br.readLine();
            s = s.substring(0,(int)s.length()-1);
            System.out.println((int)eval(s));
        }
    }
}

