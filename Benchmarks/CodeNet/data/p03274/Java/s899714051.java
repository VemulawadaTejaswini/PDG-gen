

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
   
	 private static boolean isPrint = false;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] inStr = br.readLine().split(" ");
        int candleCount = Integer.parseInt(inStr[0]);
        int burning = Integer.parseInt(inStr[1]);
        showMessage("蜡烛总数:"+candleCount+",点燃总数:"+burning);
        int[] arr = new int[candleCount];
        inStr = br.readLine().split(" ");
        for (int i = 0; i < candleCount; i++) {
            arr[i] = Integer.parseInt(inStr[i]);
        }

        int min = Integer.MAX_VALUE;
        int left, right, temp=0;
        for (int i = 0; i < candleCount - burning + 1; i++) {
            left = arr[i];
            right = arr[i + burning - 1];
            //右边在负轴
            if(right<0) {
            	temp = Math.abs(left);
            	min = Math.min(min, temp);
            	continue;
            }
            //左边在正轴
            if(left >= 0) {
            	temp = Math.abs(right);
            	min = Math.min(min, temp);
            	continue;
            }
            if(right>=0&&left<0) {
            	temp = Math.min(Math.abs(left) * 2 + right, Math.abs(left) + right * 2); 
            	min = Math.min(min, temp);
            }
        }
        System.out.println(min);
    }
    public static void showMessage(Object message) {
		if(isPrint) {
			System.out.println(message);
		}
	}
}