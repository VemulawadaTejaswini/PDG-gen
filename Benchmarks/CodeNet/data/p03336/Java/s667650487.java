import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            String S = sc.next();
            String T = sc.next();
            ExNum s = ExNum.of(S);
            ExNum t = ExNum.of(T);
            for ( int k = 0; k <K; k++ ) {
            	ExNum z = s.bitwiseAnd(t);
            	s = s.add(z);
            	t = t.add(z);
            }
            System.out.println(s);
            System.out.println(t);
        }
    }
    
    
    private static void debug(String msg) {
//    	System.out.println(msg);
    }
    
    private static class ExNum {
    	private final String s;
    	
    	private ExNum(String s) {
    		this.s = s;
    	}
    	
    	public static ExNum of(String A) {
    		return new ExNum(A);
    	}
    	
    	public String toString() {
    		return s;
    	}
    
    	public ExNum bitwiseAnd(ExNum other) {
	        int nA = s.length();
	        String B = other.s;
	        int nB = B.length();
	        String big = null;
	        String small = null;
	        if ( nA > nB ) {
	            big = s;
	            small = B;
	        }
	        else {
	            big = B;
	            small = s;
	        }
	        char[] bigChar = big.toCharArray();
	        char[] smallChar = small.toCharArray();
	        int N = big.length();
	        int n = small.length();
	        StringBuilder sb = new StringBuilder();
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
	        debug(s + " & " + B + " = " + ret);
	        return ExNum.of(ret);
    	}
    
    	public ExNum add(ExNum other) {
	        int nA = s.length();
	        String B = other.s;
	        int nB = B.length();
	        String big = null;
	        String small = null;
	        if ( nA > nB ) {
	            big = s;
	            small = B;
	        }
	        else {
	            big = B;
	            small = s;
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
	        StringBuilder sb = new StringBuilder();
	        boolean blnKuriagari = false;
	        for ( int i = 0; i < N; i++ ) {
	            char d1 = bigChar[N-1-i];
	            char d2 = adjustedSmallChar[N-1-i];
	            ExBit sum = ExBit.of(d1).add(ExBit.of(d2));
	            debug(d1 + " + " + d2 + " = " + sum);
	            if ( blnKuriagari ) {
	            	sum = sum.add(ExBit.ONE);
	            }
	            sb.insert(0, sum.c);
	            blnKuriagari = sum.isKuriagari();
	        }
	        if ( blnKuriagari ) {
	        	sb.insert(0, '1');
	        }
	        String ret = sb.toString();
	        debug(s + " + " + B + " = " + ret);
	        return ExNum.of(ret);
    	}
    }
    
    private static class ExBit {
    	
    	private final static ExBit ZERO = ExBit.of('0');
    	private final static ExBit ONE = ExBit.of('1');
    	
        private final boolean blnKuriagari;
        private final char c;
        
        private static Map<String,ExBit> exBitSumMap;
        
        static {
        	exBitSumMap  = new HashMap<String,ExBit>();
        	exBitSumMap.put("00", ExBit.ZERO);
        	exBitSumMap.put("01", ExBit.ONE);
        	exBitSumMap.put("10", ExBit.ONE);
        	exBitSumMap.put("11", new ExBit(true, '0'));
        }

        private ExBit(boolean blnKuriagari, char c) {
            this.blnKuriagari = blnKuriagari;
            this.c = c;
        }

        public static ExBit of(char c) {
            return new ExBit(false, c);
        }

        public boolean isKuriagari() {
             return blnKuriagari;
        }
        
        @Override
        public String toString() {
        	StringBuilder sb = new StringBuilder();
        	if ( isKuriagari() ) {
        		sb.append('1');
        	}
        	sb.append(c);
        	return sb.toString();
        }

        public ExBit add(ExBit other) {
            if ( isKuriagari() || other.isKuriagari() ) {
               throw new UnsupportedOperationException();
            }
            char d1 = this.c;
            char d2 = other.c;
            String key = String.valueOf(d1) + String.valueOf(d2);
            return exBitSumMap.get(key);
        }
    }
}
