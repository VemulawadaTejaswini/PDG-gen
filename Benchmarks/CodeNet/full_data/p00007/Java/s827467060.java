import java.util.*;
import java.util.stream.Collectors;
import static java.lang.System.*;

public class Main extends CodingSupport {
    protected void solve() {
        int input = scanInt();
        double dept  = 100000.0;

        for( int i = 0; i < input ; i++ ) {
            dept = dept * 1.05;
            if(dept % 1000 != 0 ) {
                dept -= dept % 1000;
                dept += 1000;
            }
        }
        print((int)dept);
    }
}

abstract class CodingSupport {
    protected Scanner sc;
    protected CodingSupport() {
        sc = new Scanner(in);
    }
    
    public static void main(String[] args) throws Exception {
        new Main().solve();
    }
    
    protected abstract void solve();
    
    protected void print(Object o) {
        out.println(o);
    }
    
    protected Double[] scanDoubles() {
        return 
          Arrays
              .stream(scanInts())
              .map(Integer::doubleValue)
              .toArray(Double[]::new);
    }
    
    protected Integer[] scanInts() {
       return strArrayToIntArray(sc.nextLine().split(" "));
    }
    
    protected String[] scanLineToTokens(String delimiter) {
        return sc.nextLine().split(delimiter);
    }
    
    protected int scanInt() {
       return sc.nextInt();
    }

    protected List<Integer> strArrayToIntList(String[] strArray) {
        List<Integer> intList =
          Arrays
            .stream(strArray)
            .map(Integer::valueOf)
            .collect(Collectors.toList());
        return intList;
    }
    
    protected Integer[] strArrayToIntArray(String[] strArray) {
        Integer[] intArray =
        Arrays
            .stream(strArray)
            .map(Integer::valueOf)
            .toArray(Integer[]::new);
        return intArray;
    }
}
