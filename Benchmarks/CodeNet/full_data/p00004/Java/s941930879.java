import java.util.*;
import java.util.stream.Collectors;
import static java.lang.System.*;

public class Main extends CodingSupport {
    protected void solve() {
        while(sc.hasNext()) {
            Double[] inputs = scanDoubles();
            Double[] equation1  = {inputs[0], inputs[1], inputs[2]};// ax + by = cのa,b,c
            Double[] equation2  = {inputs[3], inputs[4], inputs[5]};// ax + by = cのa,b,c
            Double[] equation2_1 = new Double[4];
            Double resultX = null;
            Double resultY = null;
            
            if( equation2[0] != 0 && equation2[1] != 0) {
                Double coeeficient1 = equation2[0] / equation1[0];
                for( int i = 0; i < equation1.length; i++ ) {
                    equation2_1[i] = equation2[i] - equation1[i] * coeeficient1;
                }
                resultY = equation2_1[2] / equation2_1[1];
                resultX = (equation1[2] - equation1[1] * resultY) / equation1[0];
            } else if (equation2[0] == 0 ) {
                resultY = equation2[2] / equation2[1];
                resultX = (equation1[2] - equation1[1] * resultY) / equation1[0];
            } else if ( equation2[1] == 0 ) {
                resultX = equation2[2] / equation2[0];
                resultY = (equation1[2] - equation1[0] * resultX) / equation1[0];
            }
            
            
            out.println(String.format("%.3f %.3f", resultX,resultY));
        }
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
