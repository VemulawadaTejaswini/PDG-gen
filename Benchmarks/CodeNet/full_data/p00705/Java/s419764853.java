import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String [] str = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int quorum = Integer.parseInt(str[1]);
			
			int[] availNum = new int[51];
			Arrays.fill(availNum, 0);
			
			if(n == 0 && quorum == 0){
				break;
			}
			for(int i = 0 ; i < n; i++){
				str = br.readLine().split(" ");
				int m = Integer.parseInt(str[0]);
				
				for(int j = 0; j < m ; j++){
					int date = Integer.parseInt(str[j + 1]);
					availNum[date]++;
				}
				
			}
			
			//????¶???°??\????????????????????????????????\?????¢???
			int earlyDay = 0;
			
			for(int i = 1; i < availNum.length ; i++){
				if(availNum[i] >= quorum && availNum[i] > availNum[earlyDay]){
					earlyDay = i;
				}
			}
			
			System.out.println(earlyDay);
		}
			
	}

}