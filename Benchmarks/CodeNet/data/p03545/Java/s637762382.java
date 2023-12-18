
import java.io.PrintStream;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        int a = s.charAt(0) - '0';
        int b = s.charAt(1) - '0';
        int c = s.charAt(2) - '0';
        int d = s.charAt(3) - '0';
        
        Operator[] opes = Operator.values();
        int len =opes.length;
        for (int ia = 0; ia < len; ia++) {
            for (int ib = 0; ib < len; ib++) {
                for (int ic = 0; ic < len; ic++) {
                    if (opes[ic].apply(opes[ib].apply(opes[ia].apply(a, b), c), d).equals(7)) {
                        so.println("" + a + opes[ia] + b + opes[ib] + c + opes[ic] + d + "=7");
                        return;
                    }
                }
            }
        }
    }
    
    public static enum Operator {
        PLUS("+", (Integer a, Integer b) -> a + b),
        MINUS("-", (Integer a, Integer b) -> a - b);
        
        private Operator(String s, BiFunction<Integer, Integer, Integer> operation) {
            this.s = s;
            this.operation = operation;
        }
        
        public Integer apply(Integer a, Integer b) {
            return this.operation.apply(a, b);
        }
        private final String s;
        private final BiFunction<Integer, Integer, Integer> operation;
        
        public String toString() {
            return s;
        }
    }
}
