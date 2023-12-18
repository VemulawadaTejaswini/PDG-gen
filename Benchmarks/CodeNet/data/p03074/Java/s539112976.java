import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	static BufferedReader reader;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] NKs = readLine().split(" ");
		int N = Integer.parseInt(NKs[0]);
		int K = Integer.parseInt(NKs[1]);
		
		int[] S = readLine().chars().toArray();
		int c_0 = "0".charAt(0);
		int c_1 = "1".charAt(0);
		boolean now = false;
		ArrayList<Integer> cnt_0_1 = new ArrayList<>();
		int tmp = 0;
		for(int i=0;i<N;i++) {
			if(now) {
				if(S[i]==c_0) {cnt_0_1.add(tmp);tmp=1;now=false;}
				else{tmp++;}
			}else {
				if(S[i]==c_0) {tmp++;}
				else{cnt_0_1.add(tmp);tmp=1;now=true;}
			}
		}
		cnt_0_1.add(tmp);
		
		int max_pt = 0;
		int pt=0;
		for(int i=0;i<K*2;i++) {
			if(i<cnt_0_1.size()) {
				pt+=cnt_0_1.get(i);
			}
		}
		max_pt = pt;
		for(int sp=2;sp+K*2-1<=cnt_0_1.size();sp+=2) {
			pt-=cnt_0_1.get(sp-2);
			if(sp-3>=0) {pt-=cnt_0_1.get(sp-3);}
			if(sp+K*2-2<cnt_0_1.size()) {pt+=cnt_0_1.get(sp+K*2-2);}
			if(sp+K*2-1<cnt_0_1.size()) {pt+=cnt_0_1.get(sp+K*2-1);}
			if(pt>max_pt) {max_pt = pt;}
		}
		
		System.out.println(max_pt);
	}

	private static String readLine(){
		try{
			return reader.readLine();
		}catch(Exception e){
			return e.getMessage();
		}
	}
}