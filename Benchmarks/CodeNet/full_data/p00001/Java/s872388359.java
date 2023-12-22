import java.util.*;
import java.io.*;

class HillsOfTop3 {

    public static void main (String args[]) {
		int[] mountain = new int[10];
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			for (int i = 0; i < 10; i++) {
				int num = Integer.parseInt(br.readLine());
				if (num >= 0 && num <= 10000) {
					mountain[i] = num;
				}
			}
			
			Arrays.sort(mountain);
			
			for (int i = 9; i > 6; i--) {
				System.out.println(mountain[i]);
			}
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
    }
}