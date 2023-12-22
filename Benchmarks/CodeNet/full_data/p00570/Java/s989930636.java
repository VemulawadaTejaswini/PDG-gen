import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class AOJ0647 {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str;
            while ((str = br.readLine()) != null) {
            	String[] num = str.split(" "); 
            	int guest = Integer.parseInt(num[0]);
            	int match = Integer.parseInt(num[1]);
            	int[] startTime = new int[guest];
            	int[] endTime = new int[guest];
            	int[] gapTime = new int [guest - 1];
            	
            	for (int i = 0; i < guest; i++) {
            		startTime[i] = Integer.parseInt(br.readLine());
            		endTime[i] = startTime[i] + 1;
            		if (i == 0) continue;
            		gapTime[i-1] = startTime[i] - endTime[i-1];
            	}
            	
            	Arrays.sort(gapTime);
            	
            	int tmp = guest - match;
            	int totalTime = guest;
            	for (int i = 0; i < tmp; i++) {
            		totalTime += gapTime[i];
            	}
            	System.out.println(totalTime);

            }
            } catch (Exception e) {
                System.out.println(e);
            }
	}

}

