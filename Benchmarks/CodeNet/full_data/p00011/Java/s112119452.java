import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

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
            proccessAmidakuji(
            		Integer.parseInt(lines.get(0)),
            		Integer.parseInt(lines.get(1)),
            		lines.stream().skip(2).map(l -> new Yokosen(l.split(","))).collect(Collectors.toList()));
            
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
    private static void proccessAmidakuji(int tatesenNum, int yokosenNum, List<Yokosen> yokosenList) {
    	
    	// ????????°?????????????????????
    	for (int tatesenNo = 1; tatesenNo <= tatesenNum; tatesenNo++) {
    		int amidaNo = tatesenNo;
    		for (Yokosen yokosen : yokosenList) {
    			if (yokosen.isContain(amidaNo))
    				amidaNo = yokosen.getExchangeNumber(amidaNo);
    		}
    		System.out.println(amidaNo);
    	}
    }

	/**
	 * @author works
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