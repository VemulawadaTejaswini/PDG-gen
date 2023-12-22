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
		double mon = 0;
		int syo=0,hisi=0;
		double aaaa = 1;
		
		
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
			
			st = Integer.parseInt(tmp);
			
			if(st == 0){
				break;
			}
			
			int[][] eee = new int[st][st];
			
			for(int i=0;i<st;i++){
				for(int j=0;j<st;j++){
					eee[i][j] = -1;
				}
			}
			
			eee[(st/2)+1][st/2] = 1;
			
			int[] vn = new int[2];
			vn[0] = st/2;
			vn[1] = st/2;
			vn[0]++;
			vn[0]++;
			vn[1]++;
			for(int i=2;i<st*st+1;i++){
				
				saiki(eee,vn,i);
				vn[0]++;
				vn[1]++;
				
			}
			
			
			for(int i=0;i<st;i++){
				for(int j=0;j<st;j++){
					System.out.printf("%4d",eee[i][j]);
				}
				System.out.println();
			}
			
		}
		
	}
	public static void saiki(int[][] eee, int[] vn,int s){
		
		
		if(vn[1] >= eee.length){
			vn[1] = 0;
		}else if(vn[1] < 0){
			vn[1] = eee.length -1;
		}else if(vn[0] >= eee.length){
			vn[0] = 0;
		}else if(eee[vn[0]][vn[1]] != -1){
			vn[0]++;
			vn[1]--;
		}else{
			eee[vn[0]][vn[1]] = s;
			return;
		}
		
		saiki(eee,vn,s);
	}

}