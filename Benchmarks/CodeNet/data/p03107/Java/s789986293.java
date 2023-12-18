
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String temp = br.readLine();
			int slength = temp.length();
		String tempBefRep=temp;	
		String tempAftRep="";
          while (true) {
                
        	  tempAftRep=replaceByHand(temp, "01","");
				tempAftRep=replaceByHand(temp, "10","");
				//int tempLength=temp.length();
				//temp=temp.replace("01","").replace("10","");
				// replace前後で長さが変わらない場合Loopを抜ける
				if (tempAftRep==tempBefRep) {
					break;
				}
            tempBefRep=tempAftRep;
              
			}
			
			System.out.println(slength-tempAftRep.length());

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static String replaceByHand(final String original, final String old, final String replace) {
	    int offset = 0;
	    StringBuilder builder = new StringBuilder(original.length());
	    int index;
	    while (0 <= (index = original.indexOf(old, offset))) {
	        builder.append(original, offset, index);
	        builder.append(replace);
	        offset = index + old.length();
	    }
	    builder.append(original, offset, original.length());
	    return builder.toString();
	}
}
