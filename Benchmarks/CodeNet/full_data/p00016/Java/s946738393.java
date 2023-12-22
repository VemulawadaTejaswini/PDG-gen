import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] aegs){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0,c=0;
		String t = "";
		double counta =0,countb = 0;
		double rad = 90.0;
		double PI = Math.PI;
		
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
			
			
			System.out.println(rad);
			
			counta +=  (a * Math.sin(rad*PI/180d));
			countb +=  (a * Math.cos(rad*PI/180d));
			rad = rad - c;
			
		}
		System.out.println((int)countb);
		System.out.println((int)counta);
		
	}


}