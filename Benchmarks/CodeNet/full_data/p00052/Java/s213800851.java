import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args){
		BigDecimal one = new BigDecimal("1.00");
		int[] abo = {0,0,0,0};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int cup = 0;
		int mun = 0;
		int ter = 0;
		String[] rrr;
		int st = 0,sr = 0;
		int mon = 0;
		int syo=0,hisi=0;
		long aaaa = 1;
		
		
		while(true){
			
			try {
				tmp = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			if(tmp == null){
				break;
			}
			
			if(tmp.equals("")){
				break;
			}
			
			mon = Integer.parseInt(tmp);
			
			
			for(int i=1;i<mon+1;i++){
				BigDecimal ttt = new BigDecimal(i);
				one = one.multiply(ttt);
			}
			
			String eee = one.toString().substring(0, one.toString().length()-3);
			
			int abc = 0;
			
			for(int i=0;i<eee.length();i++){
				if(eee.charAt(i) =='0'){
					abc++;
				}
			}
			System.out.println(abc);
			
		}
		
		
		
	}

}