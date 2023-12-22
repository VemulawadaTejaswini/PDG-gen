import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string, str[];
		
		int n, m, sum;
		while(!(string = reader.readLine()).equals("0")){
			n = Integer.valueOf(string);
			
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for(int i = 0; i < n; i++){
				str = reader.readLine().split(" ");
				map.put(str[0], Integer.valueOf(str[1]));
			}
			
			n = Integer.valueOf(reader.readLine());
			for(int i = 0; i < n; i++){
				str = reader.readLine().split(" ");
				m = Integer.valueOf(str[1]);
				sum = 0;
				for(int j = 0; j < m; j++){
					sum += map.get(str[j + 2]);
				}
				
				if(map.get(str[0]) > sum) map.put(str[0], sum);
			}
			
			System.out.println(map.get(reader.readLine()));
		}
		reader.close();
	}
}