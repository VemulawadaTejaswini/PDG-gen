import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String str;
		
		int n, m, a, d, k, x[] = new int[]{1, -1}, o;
		l : while(!(str = reader.readLine()).equals("0")){
			n = Integer.valueOf(str);
			k = m = Integer.valueOf(reader.readLine()) - 1;
			a = Integer.valueOf(reader.readLine()) - 1;
			d = Integer.valueOf(reader.readLine());
			
			int node[][] = new int[n][d];
			for(int i = 0; i < d; i++){
				char c[] = reader.readLine().toCharArray();
				
				for(int j = 0; j < c.length; j++){
					if(c[j] == '1'){
						node[j][i] = j + 1;
						node[j + 1][i] = j;
					}
				}
			}
			for(int i = d - 1; i >= 0; i--){
				if(node[k][i] != 0) k = node[k][i];
			}
			if(k == a){
				System.out.println(0);
				continue;
			}else{
				for(int g = 0; g < 2; g++)
				for(int i = d - 1; i >= 0; i--){
					k = m;
					o = 0;
					for(int j = d - 1; j >= 0; j--){
						if(i == j && (0 <= k + x[g] || k + x[g] < n)){
							k += x[g];
							o = k;
						}
						if(node[k][j] != 0) k = node[k][j];
					}
					if(k == a){
						System.out.println((i - 1) + " " + (o + x[g] + 1));
						continue l;
					}
				}
			}
			System.out.println(1);
		}
		reader.close();
	}
}