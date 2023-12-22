import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Main m = new Main();
		String sec_ = br.readLine();
		int sec = Integer.parseInt(sec_);
		m.SecToTime(sec);
	}
	
	public void SecToTime(int sec){
		int h = 0,m = 0;
		
		while(sec >= 3600){
			h++;
			sec -= 3600;
		}
		
		while(sec >= 60){
			m++;
			sec -= 60;
		}
		
		System.out.println(h+":"+m+":"+sec);
	}
}