import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int n, m;
		
		while(!(string = reader.readLine()).equals("0 0")){
			n = Integer.valueOf(string.split(" ")[0]);
			m = Integer.valueOf(string.split(" ")[1]);
			
			int trout[] = new int[n];
			for(int i = 0; i < n; i++) trout[i] = Integer.valueOf(reader.readLine());
			
			int modern = 0;
			for(int i = 0; i < m; i++){
				modern += Integer.valueOf(reader.readLine());
				if(modern >= n - 1){
					System.out.println(i + 1);
					break;
				}else{
					modern += trout[modern];
					if(modern >= n - 1){
						System.out.println(i + 1);
						break;
					}
				}
			}
		}
		
		reader.readLine();
	}
}