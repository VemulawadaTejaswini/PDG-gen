import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args){
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int n,m;
		String str,end,c;
		
		try{
		while(true){
			n = Integer.parseInt(reader.readLine());
			if(n == 0)break;
			String[][] h = new String[n][2];
			str = end = "";
			
			for(int i = 0; i < n; i++){
				c = reader.readLine();
				h[i][0] = String.valueOf(c.charAt(0));
				h[i][1] = String.valueOf(c.charAt(c.length() - 1));
			}
			m = Integer.parseInt(reader.readLine());
			
			for(int i = 0; i < m; i++)
				str += reader.readLine();
			
			x:for(int i = 0; i < str.length(); i++){
				for(int j = 0; j < n; j++)
					if(str.charAt(i) == h[j][0].charAt(0)){
						end += String.valueOf(str.charAt(i)).replaceAll(h[j][0], h[j][1]);
					continue x;}
			end += str.charAt(i);
			}
			
			System.out.println(end);
		}
		reader.close();
		}catch(IOException e){
		}
	}
}