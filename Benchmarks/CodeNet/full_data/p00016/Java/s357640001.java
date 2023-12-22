import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] aegs){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0,c=0;
		String t = "";
		int counta =0,countb = 0;
		double rad = 90.0;
		double pi = 3.14;
		
		while(true){
		
			try {
				t = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			
			String[] tt = t.split(",",0);
			a = Integer.parseInt(tt[0]);
			c = Integer.parseInt(tt[1]);
			if(a == 0 && c == 0){
				break;
			}
			if(c > 0){
				rad = rad - c;
			}
			else{
				rad = rad + c;
			}
			
			
			counta += (int) (a * Math.sin(rad*pi/180d));
			countb += (int) (a * Math.cos(rad*pi/180d));
			
		}
		System.out.println(counta);
		System.out.println(countb);
		
	}


}