import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main
{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ans;
		try{
			while(true){
				String line = br.readLine();
				StringTokenizer st = new StringTokenizer(line);
				int s = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
				System.out.println(Math.round(Math.log10(s) + 1));
				if(line == null){
					break;
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}