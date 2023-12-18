import java.math.BigDecimal;
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer inputVal = new Integer(in.readLine());
        String outputFlg = "0";
        // 素数、個数
        Map<Integer,Integer> map = new HashMap<>();
        Integer i = 2;
        if (inputVal >= 1 && inputVal % 2 == 1) {
        	while (inputVal != 1) {
        		if (inputVal % i == 0) {
        			if (map.containsKey(i)) {
        				Integer pnCnt = map.get(i);
        				map.put(i,pnCnt++);
        			} else {
        				map.put(i,1);
        			}
        			inputVal /= i;
        		} else {
        			i++;
        		}
        	}
        	// 約数の個数判定
        	Integer outputVal = 1;
        	for (Integer val : map.values()) {
        		outputVal = outputVal * (val + 1);
        	}
        	if (outputVal == 8) {
        		outputFlg = "1";
        	}
        	
        }
        System.out.println(outputFlg);
    }
}