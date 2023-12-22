import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author ikaruga
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            List<String> lines = br.lines().collect(Collectors.toList());
            // ?????\??????????????????
            String[] result = proccessAmidakuji(
            		Integer.parseInt(lines.get(0)),
            		Integer.parseInt(lines.get(1)),
            		lines.stream().skip(2).map(l -> new Yokosen(l.split(","))).collect(Collectors.toList()));
            
            Stream.of(result).forEach(System.out::println);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * ?????\???????????????????????????
     * 
     * @param tatesenNum
     * @param yokosenNum
     * @param yokosenList
     */
    private static String[] proccessAmidakuji(int tatesenNum, int yokosenNum, List<Yokosen> yokosenList) {
    	String[] result = new String[tatesenNum];
    	
    	// ????????°?????????????????????
    	for (int tatesenNo = 1; tatesenNo <= tatesenNum; tatesenNo++) {
    		int amidaNo = tatesenNo;
    		for (Yokosen yokosen : yokosenList) {
    			if (yokosen.isContain(amidaNo))
    				amidaNo = yokosen.getExchangeNumber(amidaNo);
    		}
    		result[amidaNo-1] = String.valueOf(tatesenNo);
    	}
    	return result;
    }

	/**
	 * @author ikaruga
	 *
	 */
	static class Yokosen {
		int startNo = 0;
		int endNo = 0;
		
		public Yokosen(String[] numbers) {
			startNo = Integer.parseInt(numbers[0]);
			endNo = Integer.parseInt(numbers[1]);
		}
		
		public boolean isContain(int number) {
			return startNo == number || endNo == number;
		}
		
		public int getExchangeNumber(int number) {
			return startNo + endNo - number;
		}
	}
}