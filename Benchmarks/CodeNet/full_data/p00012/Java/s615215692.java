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
		double[] tmper = new double[6];
		boolean flag;
		
		double tmpkata=0,tmptaka,tmpyoko;
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
			for(i=0;i<6;i++){
				tmper[i] = Double.parseDouble(sprite[i]);
			}
			tmp1 = Double.parseDouble(sprite[6]);
			tmp2 = Double.parseDouble(sprite[7]);
			ban=0;
			if(!tenpesuto(uuuuu,tmp2,tmp1,tmper,ban)){
				flag = false;
			}
			ban=1;
			if(!tenpesuto(uuuuu,tmp2,tmp1,tmper,ban)){
				flag = false;
			}
			ban=2;
			if(!tenpesuto(uuuuu,tmp2,tmp1,tmper,ban)){
				flag = false;
			}
			
					
			if(flag){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
		}
		
	}
	static boolean tenpesuto(int uuuuu,double tmp2,double tmp1,double[] tmper,int ban){
		boolean ret=true;
		double tmpy;
		double tmpx;
		double tmpkata = 0d;
		int ban0 = 0,ban1 = 0,ban2 = 0,ban3 = 0,ban4 = 0,ban5 = 0;
		
		if(ban == 0){
			ban0 = 0;
			ban1 = 1;
			ban2 = 2;
			ban3 = 3;
			ban4 = 4;
			ban5 = 5;
		}else if(ban == 1){
			ban0 = 0;
			ban1 = 1;
			ban2 = 4;
			ban3 = 5;
			ban4 = 2;
			ban5 = 3;
		}else if(ban == 2){
			ban0 = 4;
			ban1 = 5;
			ban2 = 2;
			ban3 = 3;
			ban4 = 0;
			ban5 = 1;
		}
		
		tmpx = tmper[ban0] - tmper[ban2];
		tmpy = tmper[ban1] - tmper[ban3];
		if(tmpx == 0d){
			if(tmper[ban0] > tmper[ban4]){
				uuuuu = -1;
			}
			else if(tmper[ban0] < tmper[ban4]){
				uuuuu = -2;
				System.out.println("NO");
			}
		}else if(tmpy == 0d){
			if(tmper[ban1] > tmper[ban5]){
				uuuuu = -3;
			}
			else if(tmper[ban1] < tmper[ban5]){
				uuuuu = -4;
			}
		}else{
			tmpkata = tmpy/tmpx;
			if(tmpkata*tmper[ban4] < tmper[ban5]){
				uuuuu = 1;
			}else if(tmpkata*tmper[ban4] > tmper[ban5]){
				uuuuu=2;
			}
		}
		
		if(uuuuu==1){
			if(tmp1*tmpkata > tmp2){
				ret = false;
			}
		}else if(uuuuu==2){
			if(tmp1*tmpkata < tmp2){
				ret = false;
			}
		}else if(uuuuu == -1){
			if(tmper[ban0] < tmp1){
				ret =false;
			}
		}else if(uuuuu == -2){
			if(tmper[ban0] > tmp1){
				ret =false;
			}
		}
		else if(uuuuu == -3){
			if(tmper[ban1] < tmp2){
				ret =false;
			}
		}else if(uuuuu == -4){
			if(tmper[ban1] > tmp2){
				ret =false;
			}
		}
		
		
		return ret;
	}
}