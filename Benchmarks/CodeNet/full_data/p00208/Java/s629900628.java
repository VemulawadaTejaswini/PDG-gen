import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while(true){
			line = br.readLine();
			int num = Integer.valueOf(line);
			if(num == 0){
				break;
			}
			System.out.println(getNewNum2(num));
		}
	}
	
/*	private static long getNewNum(int target){
		long cnt = 0;
		for(long i = 1; ; i++){
			String str = String.valueOf(i + cnt);
			if(str.contains("4") || str.contains("6")){
				cnt++;
				continue;
			}
			if(i == target){
				return i + cnt;
			}
		}
	}*/
	
	private static long getNewNum2(int target){
		int[] tb = {0, 1, 2, 3, 5, 7, 8, 9};
		String str = Integer.toOctalString(target);
		
		String result = "";
		for(String s : str.split("")){
			int i = Integer.parseInt(s);
			result = result + tb[i];
		}
		
		return Long.parseLong(result);
	}
}