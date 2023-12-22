import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] buf = str.split(" ");
		int N= Integer.parseInt(buf[0]);
		int W= Integer.parseInt(buf[1]);
		int[] DP= new int[W+1];
		int v,w;
		
		int j;
		for(j=1;j<W+1;j++){
			DP[j]= -1;
		}
		int i;
		for(i=0;i<N;i++){
			str = br.readLine();
			buf = str.split(" ");
			v= Integer.parseInt(buf[0]);
			w= Integer.parseInt(buf[1]);
			for(j=0;j<W-w+1;j++){
				if( DP[j]>=0 && DP[j]+v>DP[j+w] ){
					DP[j+w]= DP[j]+v;
				}
			}
		}
		
		int v_max=0;
		for(j=W;j>0;j--){
			if( v_max<DP[j] ){
				v_max= DP[j];
			}
		}
		System.out.println(v_max);
	}
}