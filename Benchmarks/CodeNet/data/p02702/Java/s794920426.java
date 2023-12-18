import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        String givenNum = sc.next();
        int dividedCount = 0;
        BigInteger _2019 = BigInteger.valueOf(2019);
        Set<String> notDividedSet = new HashSet<>();
        Map<String, Integer> dividedMap = new HashMap<>();
        for (int i = 0; i < givenNum.length() - 3; i++) {
            for (int j = i + 4; j <= givenNum.length(); j++) {
                String cutNum = givenNum.substring(i, j);
                if (notDividedSet.contains(cutNum)) {
                    continue;
                } else if (dividedMap.containsKey(cutNum)) {
                    int value = dividedMap.get(cutNum);
                    dividedMap.replace(cutNum, value + 1);
                    continue;
                }
                BigInteger parsedNum = new BigInteger(cutNum);
                BigInteger remainder = parsedNum.remainder(_2019);
                boolean canDivided = remainder.equals(BigInteger.ZERO);
                if (canDivided) {
                    dividedMap.put(cutNum, 1);
                } else {
                    notDividedSet.add(cutNum);
                }
            }
        }
        int result = dividedMap.values().stream().reduce(Integer::sum).orElse(0);
        System.out.println(result);
    }
}
