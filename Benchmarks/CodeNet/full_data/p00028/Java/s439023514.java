import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] num = new int[101];
		Arrays.fill(num, 0);
		int mode = 0;
		while(true){
			String tmp = br.readLine();
			//System.out.println("prg");
			if(tmp == null){
				break;
			}
			
			int n = Integer.parseInt(tmp);
			
			num[n]++;
			if(num[n] > mode){
				mode = num[n];
			}
		}
		
		for(int i = 1; i <= 100; i++){
			if(mode == num[i]){
				System.out.println(i);
			}
		}
	}

}