import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class Main {
	
	// 単位時間
	static double TIME_UNIT = 1;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = null;
		InputStreamReader in = new InputStreamReader(System.in);
		br = new BufferedReader(in);
		int[] line = parseIntArray(br.readLine());
		int n = line[0];
		int t = line[1];
		
		ArrayList<int[]> shops = new ArrayList<int[]>();
		for(int i=0;i<n;i++) {
			String d = br.readLine();
			shops.add(parseIntArray(d));
		}
		br.close();
		
		double close = t + 0.5;
		
		
		// 
		int max = countMax(0, close, 0, 0,shops).intValue();
		
		System.out.println(max);
	}
	
	private static Integer countMax(int count,double closeTime, double now, int max,ArrayList<int[]> shopArr) {
		if((now > closeTime || shopArr.size() <= 0) && count > max) {
			if(shopArr.size() <= 0) {
				max = count;
			}
			if(now > closeTime) {
				max = (count -1);
			}
		}else {
			for(int i=0;i<shopArr.size();i++) {
				ArrayList<int[]> unusedShop = (ArrayList<int[]>)shopArr.clone();
				double time = now + (TIME_UNIT + shopArr.get(i)[0]*now + shopArr.get(i)[1]);
				if(shopArr.get(i)[1] == 4) {
					int g = 0;
				}
				unusedShop.remove(i);
				max = countMax(count+1, closeTime, time, max, unusedShop);
			}
		}
		return max;
	}
	
	private static int[] parseIntArray(String line) {
		String[] arr = line.split(" ");
		int [] intArr = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			intArr[i] = Integer.parseInt(arr[i]);
		}
		return intArr;
	}
}