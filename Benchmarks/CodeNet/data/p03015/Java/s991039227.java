import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.math.*;
import java.io.*;



public class Main {
    class FactorRing {
        final long IDEAL = 1000000007;
        long value;
        FactorRing(long v){
            value = v;
        }
        FactorRing add(FactorRing a) {
            return new FactorRing((value + a.value) % IDEAL);
        }
        FactorRing multiply(FactorRing a) {
            return new FactorRing((value * a.value) % IDEAL);
        }
        @Override
        public String toString(){
            return String.valueOf(value);
        }
    }

    public static void main(String argv[]) {
        Main m = new Main();
        m.start();
    }

    final FactorRing THREE = new FactorRing(3);
    final FactorRing TWO = new FactorRing(2);
    final FactorRing ONE = new FactorRing(1);
    public void start() {
        Scanner cin = new Scanner(System.in);

        String s = cin.next();

        FactorRing a = answer(s, 0, s.length());

        System.out.println(a);
    }

    FactorRing answer(String s, int start, int end){
        if (start == end) return ONE;
        if (s.charAt(start) == '1') {
            FactorRing v2 = s.substring(start + 1).chars()
                .mapToObj(a -> THREE)
                .reduce(ONE, (c,a)-> c.multiply(a));
            return v2.add(TWO.multiply(answer(s, start+1, end)));
        } else {
            return answer(s, start+1, end);
        }
    }
}
