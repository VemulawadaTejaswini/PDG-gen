//?§?????????????????§???§??¨???
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		int hour=0;
		int minute=0;
		int count=0;
		
		hour = (int) Math.floor(num/3600);
		minute = (int)Math.floor((num-(hour*3600))/60);
		count = (num-(hour*3600)-(minute*60));
	    
	    System.out.println(hour + ":" + minute + ":"+ count);
	}
}
		