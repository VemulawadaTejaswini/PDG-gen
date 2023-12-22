import java.util.*;
import java.io.*;

public class HillsOfTop3 {

    public static void main (String args[]) {
        //ArrayList ar = new ArrayList();
		int[] mountain = new int[10];
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			for (int i = 0; i < 10; i++) {
				mountain[i] = Integer.parseInt(br.readLine());
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