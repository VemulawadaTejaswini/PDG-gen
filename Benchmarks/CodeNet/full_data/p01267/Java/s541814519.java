import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		
		int n, a, b, c, x, count;
		while(!(string = reader.readLine()).equals("0 0 0 0 0")){
			n = Integer.valueOf(string.split(" ")[0]);
			a = Integer.valueOf(string.split(" ")[1]);
			b = Integer.valueOf(string.split(" ")[2]);
			c = Integer.valueOf(string.split(" ")[3]);
			x = Integer.valueOf(string.split(" ")[4]);
			count = 0;
			
			ArrayList<Integer> que = new ArrayList<Integer>();
			string = reader.readLine();
			for(int i = 0; i < n; i++){
				que.add(Integer.valueOf(string.split(" ")[i]));
			}
			
			while(true){
				if(que.get(0) == x) que.remove(0);
				if(count > 10000){
					count = -1;
					break;
				}
				x = (a * x + b) % c;
				if(que.isEmpty()) break;
				count++;
			}
			System.out.println(count);
		}
		reader.close();
	}
}