import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		int h = Integer.parseInt(strs[0]);
		int w = Integer.parseInt(strs[1]);
		
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i < 4 ; i++){
			int v = firstSplit(h,w,i<2 , i%2==0);
			min = (min > v)?v:min;
		}
		
		System.out.println(min);
	}
	public static int firstSplit(int h,int w,boolean splitH,boolean ForC){
		int xh,xw;
		if(splitH){
			xh = (int) ((ForC) ? Math.floor((double)h / 3.0) : Math.ceil((double)h / 3.0));
			xw = 0;
		}else{
			xw = (int) ((ForC) ? Math.floor((double)w / 3.0) : Math.ceil((double)w / 3.0));
			xh = 0;
		}
		
		return secondSplit(h - xh , w - xw ,((xh==0)?h:xh) * ((xw==0)?w:xw));
	}
	
	public static int secondSplit(int h,int w,int as){
		int[] vs = new int[4];
		vs[0] = (int)Math.floor((double)h/2.0) * w;
		vs[1] = (int)Math.ceil((double)h/2.0) * w;
		vs[2] = (int)Math.floor((double)w/2.0) * h;
		vs[3] = (int)Math.ceil((double)w/2.0) * h;
		
		int minv = Integer.MAX_VALUE;
		for(int ps : vs){
			int v = getValue(ps,h*w - ps , as);
			if(minv > v){
				minv = v;
			}
		}
		
		return minv;
	}
	
	
	public static int getValue(int a,int b,int c){
		int max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		int min = (a < b) ? a : b;
		min = (min < c) ? min : c;
		
		return max-min;
	}
}
