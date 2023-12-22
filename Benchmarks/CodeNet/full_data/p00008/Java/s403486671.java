import java.util.*;
import java.util.stream.Collectors;
import static java.lang.System.*;

public class Main extends CodingSupport {
    protected void solve() {
        Map<Integer, Integer> resultPattern = new HashMap<>();
        for(int i = 0; i <= 9; i++ ) {
            for(int j = 0; j <=9; j++ ) {
                for(int k = 0; k <=9; k++ ) {
                    for(int l = 0; l <= 9; l++ ) {
                        // List<Integer> tmpList = Arrays.asList(i, j, k, l);
                        // Collections.sort(tmpList);
                        // String key = String.format("%d%d%d%d", tmpList.get(0), tmpList.get(1), tmpList.get(2), tmpList.get(3));
                        // resultPattern.put(key, i+j+k+l);
                        Integer key = i+j+k+l;
                        if(resultPattern.containsKey(key)) {
                            resultPattern.put(key, resultPattern.get(key) + 1 );
                        } else {
                            resultPattern.put(key, 1);
                        }
                    }
                }
            }
        }
        while(sc.hasNext()) {
            int targetSum = scanInt();
            int patternCount = 0;
            print(resultPattern.get(targetSum));
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
