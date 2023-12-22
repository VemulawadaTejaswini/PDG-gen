import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		final int[] list = getList();
		final int diff = getMaxDiff(list);
		
		System.out.println(diff);
	}
	
	public static int getMaxDiff(int[] list) {
        int maxDiff = list[1] - list[0];
        int min = list[0];
        
        int diff;
        for (int i = 2; i < list.length; i++) {
        	if (list[i-1] < min) min = list[i-1];
        	diff = list[i] - min;
        	if (maxDiff < diff) maxDiff = diff;
        }
         
        return maxDiff;
    }
	
	public static int[] getList() {
		int[] list = null;
		
		try {
			final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			final int n = Integer.parseInt(reader.readLine());
			list = new int[n];
			for (int i = 0; i < n; i++) {
				list[i] = Integer.parseInt(reader.readLine());
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}