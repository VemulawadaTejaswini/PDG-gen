import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main byakko = new Main();
		String string;
		int n;
		
		while(!(string = reader.readLine()).equals("0")){
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			n = Integer.parseInt(string);
			
			int[] array = new int[n];
			for(int i = 0; i < n; i++){
				String[] num = reader.readLine().split(" ");
				int s = Integer.parseInt(num[0]);
				int m = Integer.parseInt(num[1]);
				array[i] = s;
				map.put(s, m);
			}
			Arrays.sort(array);
			
			int sum = 0;
			boolean judge = true;
			for(int i = 0; i < n; i++){
				sum += array[i];
				if(sum > map.get(array[i])){
					judge = false;
					break;
				}
			}
			if(judge){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
		reader.close();
	}
}