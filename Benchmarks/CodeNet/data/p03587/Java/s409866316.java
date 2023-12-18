import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			int cnt = 0;
			String s  = br.readLine();
			for(int i=0;i<6;i++){
				if(s.charAt(i) == '1'){
					cnt++;
				}
			}
			System.out.println(cnt);
		}catch(Exception e){
			
		}
		
	}
	
}
