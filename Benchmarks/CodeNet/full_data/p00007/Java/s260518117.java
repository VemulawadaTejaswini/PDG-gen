import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int result = 100000;//??????
			int rishi   = 5;//??????
			int n  = Integer.parseInt(br.readLine());//N??±???????????????
			
			for(int i = 0; i < n; i++){
				result = result + (result*rishi/100);//?????????????????????
			}
			
			if((result+5000)/10000 > result/10000){
				result = result/10000;
				result = (result + 1)*10000;
			}else{
				result = result/10000;
				result = result*10000;
			}
			
			System.out.println(result);//???????????¨?????????
		
	}
	
}