import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            String S = sc.next();
            String T = sc.next();
            String s = S;
            String t = T;
            for ( int k = 0; k <K; k++ ) {
                String z = bitwiseAnd(s, t);
                s = add(s, z);
                t = add(t, z);
            }
            System.out.println(s);
            System.out.println(t);
        }
    }
    
    private static String bitwiseAnd(String A, String B) {
        int nA = A.length();
        int nB = B.length();
        String big = null;
        String small = null;
        if ( nA > nB ) {
            big = A;
            small = B;
        }
        else {
            big = B;
            small = A;
        }
        char[] bigChar = big.toCharArray();
        char[] smallChar = small.toCharArray();
        int N = big.length();
        int n = small.length();
        StringBuffer sb = new StringBuffer();
        for ( int i = 0; i < n; i++ ) {
            char d1 = bigChar[i+(N-n)];
            char d2 = smallChar[i];
            if ( d1 == '1' && d2 == '1' ) {
                sb.append('1');
            }
            else {
                sb.append('0');
            }
        }
        String ret = sb.toString();
        debug(A + " & " + B + " = " + ret);
        return ret;
    }
    
    private static void debug(String msg) {
//    	System.out.println(msg);
    }

    private static String add(String A, String B) {
        int nA = A.length();
        int nB = B.length();
        String big = null;
        String small = null;
        if ( nA > nB ) {
            big = A;
            small = B;
        }
        else {
            big = B;
            small = A;
        }
        char[] bigChar = big.toCharArray();
        char[] smallChar = small.toCharArray();
        int N = big.length();
        int n = small.length();
        char[] adjustedSmallChar = new char[N];
        for ( int i = 0; i < N-n; i++ ) {
            adjustedSmallChar[i] = '0';
        }
        for ( int i = N-n; i < N; i++ ) {
            adjustedSmallChar[i] = smallChar[i-(N-n)];
        }
        debug("bigChar = " + Arrays.toString(bigChar) + ", smallChar = " + Arrays.toString(adjustedSmallChar));
        StringBuffer sb = new StringBuffer();
        boolean blnKuriagari = false;
        for ( int i = 0; i < N; i++ ) {
            char d1 = bigChar[N-1-i];
            char d2 = adjustedSmallChar[N-1-i];
            ExChar sum = ExChar.of(d1).add(ExChar.of(d2));
            debug(d1 + " + " + d2 + " = " + sum);
            if ( blnKuriagari ) {
            	sum = sum.add(ExChar.of('1'));
            }
            sb.insert(0, sum.c);
            blnKuriagari = sum.isKuriagari();
        }
        if ( blnKuriagari ) {
            sb.insert(0, '1');
        }
        String ret = sb.toString();
        debug(A + " + " + B + " = " + ret);
        return ret;
    }

    private static class ExChar {
        private final boolean blnKuriagari;
        private final char c;

        private ExChar(boolean blnKuriagari, char c) {
            this.blnKuriagari = blnKuriagari;
            this.c = c;
        }

        public static ExChar of(char c) {
            return new ExChar(false, c);
        }

        public boolean isKuriagari() {
             return blnKuriagari;
        }
        
        public String toString() {
        	StringBuilder sb = new StringBuilder();
        	if ( isKuriagari() ) {
        		sb.append('1');
        	}
        	sb.append(c);
        	return sb.toString();
        }

        public ExChar add(ExChar other) {
            if ( isKuriagari() || other.isKuriagari() ) {
               throw new UnsupportedOperationException();
            }
            char d1 = this.c;
            char d2 = other.c;
            char d;
            boolean b = false;
            if ( d1 == '0' ) {
                d = d2;
            }
            else if ( d2 == '0' ) {
                d = d1;
            }
            else {
                d = '0';
                b = true;
            }
            return new ExChar(b, d);
        }
    }
}
