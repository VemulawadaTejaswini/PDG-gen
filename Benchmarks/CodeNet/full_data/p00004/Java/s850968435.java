import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] str = br.readLine().split(" ");
			float[] n = new float[str.length];
			for(int i=0;i<str.length;i++){
				n[i]=Integer.parseInt(str[i]);
			}
			if(n[0]!=n[3]){
				float tmp=n[0]/n[3];				
				for(int j=3;j<6;j++){
					n[j]*=tmp;
				}
			}
			float tmp_l=n[1]-n[4];
			float tmp_r=n[2]-n[5];
			float y = round(tmp_r/tmp_l);
			float x = round((n[2]-(y*n[1]))/n[0]);			
			String x_str = String.format("%.3f", x);
			String y_str = String.format("%.3f", y);
			System.out.println(x_str+" "+y_str);
		}
	}
	
	private static float round(float n){
		n *=10000;
		n = Math.round(n);
		n /=10000;
		return n;
	}
}