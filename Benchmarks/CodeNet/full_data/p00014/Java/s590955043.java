import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int menseki = 0;
		int nagasa = 0;
		int a = 0,c=0;
		String t = "";
		
		while(true){
			try {
				t = br.readLine();
				if (t == null) {
					break;
				}
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
//			if(t.equals("")){
//				break;
//			}
			

			a = Integer.parseInt(t);
			c = 0;
			
			for(int i=0;i*a<600;i++){
				c += i*a*i*a;
			}
			
			 System.out.println(c);
			
		}

		
	}

}