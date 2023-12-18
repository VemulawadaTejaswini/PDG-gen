import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        final BigInteger devider = BigInteger.valueOf(1000000007);

        Scanner sc = new Scanner(System.in);
        int numberCount = sc.nextInt();
        List<BigInteger>numList = new ArrayList<>();
        BigInteger result = BigInteger.ZERO;
        XorMap xorMap = new XorMap();
        for(int i = 1;i <= numberCount ; i++){
            BigInteger number = BigInteger.valueOf(sc.nextLong());
            for(BigInteger b : numList){
                result = result.add(xorMap.xor(number,b));
            }
            numList.add(number);

        }

        System.out.println(result.remainder(devider));
    }

    public static class XorMap{
        private Map<SwappablePair,BigInteger> noteMap;
        public XorMap(){
            noteMap = new HashMap<>();
        }

        public BigInteger xor(BigInteger a,BigInteger b){
            SwappablePair pair = new SwappablePair(a,b);
            if(noteMap.containsKey(pair)){
                return noteMap.get(pair);
            }
            BigInteger xorResult = a.xor(b);
            noteMap.put(pair,xorResult);
            return xorResult;

        }
    }

    public static class SwappablePair{
        BigInteger a;
        BigInteger b;
        public SwappablePair(BigInteger a,BigInteger b){
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SwappablePair that = (SwappablePair) o;
            boolean result = Objects.equals(a, that.a) &&
                    Objects.equals(b, that.b);
            boolean swapResult = Objects.equals(a, that.b) &&
                    Objects.equals(b, that.a);
            return result || swapResult;

        }

        @Override
        public int hashCode() {
            return Objects.hash(this.a.min(this.b),this.a.max(this.b));
        }
    }
}
