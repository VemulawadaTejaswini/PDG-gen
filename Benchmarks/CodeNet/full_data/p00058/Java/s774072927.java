import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		
		int i = 0;
		int counta=0;
		int max = 0;
		int min = Integer.MAX_VALUE;
		int tmpp = Integer.MAX_VALUE;
		
		ArrayList<Integer> ast1 = new ArrayList<Integer>();
		ArrayList<Integer> ast2 = new ArrayList<Integer>();
		
		
		String[] sprite;
		
		
		double tmp1,tmp2;
		double[] tmper = new double[8];
		boolean flag;
		
		double tmpkata=0,tmpx,tmpy;
		double tmpkata2=0,tmpx2,tmpy2;
		int uuuuu;
		int ban =0;
		
		while(true){
			
			flag = true;
			uuuuu = 0;
			
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
			
			sprite = tmp.split(" ");
			for(i=0;i<8;i++){
				tmper[i] = Double.parseDouble(sprite[i]);
			}
			
			tmpy = tmper[1] - tmper[3];
			tmpx = tmper[0] - tmper[2];
			
			tmpkata = tmpy/tmpx;
			tmpkata = tmpkata*-1d;
			
			tmpy2 = tmper[5] - tmper[7];
			tmpx2 = tmper[4] - tmper[6];
			
			tmpkata2 = tmpy2/tmpx2;
			
			if(tmpkata <= tmpkata2+0.0001 && tmpkata >= tmpkata2-0.0001){
				flag = false;
			}
			
			if(tmpy == 0d){
				if(tmpx2 == 0d){
					flag = true;
				}else{
					flag = false;
				}
			}else if(tmpx == 0d){
				if(tmpy2 == 0d){
					flag = true;
				}else{
					flag = false;
				}
			}
					
			if(flag){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
		}
		
	}
}