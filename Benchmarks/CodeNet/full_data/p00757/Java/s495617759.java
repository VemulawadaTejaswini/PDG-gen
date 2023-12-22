import java.io.*;
import java.util.*;

public class Main {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
	private static StringTokenizer st;

    public static void main ( String [] args ) throws IOException
    {

	int h,w,s;

	while(true){
	
		st = new StringTokenizer(br.readLine());
		h = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		if( h == 0 && w == 0 && s == 0)	break;
	    new Main().cal(h,w,s);
	}
	
    }


int max;
int[][] area;

    private void cal(int h, int w, int s) throws IOException 
    {
	int areaSum = 0;
	area = new int[h][w];
	for(int i=0; i < h; i++){
		st = new StringTokenizer(br.readLine());
		for(int j=0; j < w; j++){
			area[i][j] = Integer.parseInt(st.nextToken());
			areaSum += area[i][j];
		}
	}
	
	//cal max
	max = areaSum - s;
	int[] out = grouping(0, 0, h, w);
	System.out.println(out[0]+" "+(out[1] - max));
	
    }


   private int[] grouping(int hs, int ws, int h, int w){
	if( hs == h || ws == w ){
		int[] temp = {0, 0};
		return temp;
	}
	int h1, h2, h3;
	int w1, w2, w3;
	int sum1, sum2, sum3;
	int grpNum;
	int[] ret = {1, calSum(hs, ws, h, w)};
	int tmpdep = 0;
	boolean didit = false;

	for(int i = h; i >= hs; i--){
	for(int j = w; j >= ws; j--){
		didit = false;
		h1 = i;
		w1 = j;
		if( h1 == h && w1 == w ){
			continue;
		}

		if( (sum1 = calSum(hs, ws, h1, w1)) >= max ){
		if( (sum2 = calSum(h1, ws, h, w)) >= max || sum2 == 0 ){
		if( (sum3 = calSum(hs, w1, h1, w)) >= max || sum3 == 0 ){
			tmpdep = sum1;
			grpNum = 1;

			int[] tmp = grouping(h1, ws, h, w);
			grpNum += tmp[0];
			if( tmpdep > tmp[1] && tmp[1] != 0 ){
				tmpdep = tmp[1];
		 	}

			tmp = grouping(hs, w1, h1, w);
			grpNum += tmp[0];
			if( tmpdep > tmp[1] && tmp[1] != 0 ){
				tmpdep = tmp[1];
			}

			if( grpNum > ret[0] ) { ret[0] = grpNum; ret[1] = tmp[1]; }
			if( grpNum == ret[0] && tmpdep < ret[1] ) ret[1] = tmpdep;
		}
		didit = true;
		}
		}


		if( (sum1 = calSum(hs, ws, h1, w1)) >= max ){
		if( (sum2 = calSum(h1, ws, h, w1)) >= max || sum2 == 0 ){
		if( (sum3 = calSum(hs, w1, h, w)) >= max || sum3 == 0){
			tmpdep = sum1;
			grpNum =1;

			int[] tmp = grouping(h1, ws, h, w1);
			grpNum += tmp[0];
			if( tmpdep > tmp[1] && tmp[1] != 0 ){
				tmpdep = tmp[1];
			}

			tmp = grouping(hs, w1, h, w);
			grpNum += tmp[0];
			if( tmpdep > tmp[1] && tmp[1] != 0 ){
				tmpdep = tmp[1];
			}

			if( grpNum > ret[0] ) { ret[0] = grpNum; ret[1] = tmp[1]; }
			if( grpNum == ret[0] && tmpdep > ret[1] ) ret[1] = tmpdep;
		}
		didit = true;
		}
		}

		if(!didit)	break;

	}
	}
	return ret;
   }

   private int calSum(int hs, int  ws, int  h, int w){
	int tmpsum=0;
	for(int i = hs; i < h; i++){
		for(int j = ws; j < w; j++){
			tmpsum += area[i][j];
		}
	}
	return tmpsum;
   }


}