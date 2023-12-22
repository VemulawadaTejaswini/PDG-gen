
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		
		int count=1;
		int max = 0;
		int min = Integer.MAX_VALUE;
		int tmpp = Integer.MAX_VALUE;
		
		ArrayList<Integer> ast1 = new ArrayList<Integer>();
		ArrayList<String> ast = new ArrayList<String>();
		
		
		String[] sprite;
		
		
		double tmp1,tmp2;
		int[] kazutmp = new int[9];
		int[] kazu = new int[4];
		int[] kazu2 = new int[9];
		boolean flag;
		
		
		int tmper;
		
		boolean flagr = false;
		
		String kaibun;
		
		//System.out.println(getsosuu(2));
		for(int i=2;i<=50000;i++){
			if(getsosuu(i)){
				ast1.add(i);
			}
		}
		
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
			if(tmp.equals("0")){
				break;
			}
			
			tmper = Integer.parseInt(tmp);
			count = 0;
			
			for(int i=0;i<ast1.size();i++){
				for(int j=0;j<ast1.size();j++){
					if(i == j){
						continue;
					}
					if(ast1.get(i)+ast1.get(j) == tmper){
						count++;
					}
				}
			}
			
			System.out.println(count);
			
		}
		
	}public static boolean getsosuu(int name) {
		boolean ret = true;
	    for(int i=2;i<name;i++){
	    	if(name%i == 0){
	    		ret = false;
	    		break;
	    	}
	    }
	    return ret;
	}
}