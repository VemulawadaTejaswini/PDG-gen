import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		
		while(!(string = reader.readLine()).equals("0")){
			int n = Integer.valueOf(string);
			int m = Integer.valueOf(reader.readLine()) - 1;
			int a = Integer.valueOf(reader.readLine()) - 1;
			int d = Integer.valueOf(reader.readLine());
			
			int node[][] = new int[n - 1][d];
			for(int i = 0; i < d; i++){
				string = reader.readLine();
				for(int j = 0; j < n - 1; j++){
					node[j][i] = string.charAt(j) - '0';
				}
			}
			
			if(doing(node, n, m, d) == a){
				System.out.println(0);
				continue;
			}else{
				boolean judge = false;
				x : for(int i = 0; i < d; i++){
					for(int j = 0; j < n - 1; j++){
						if(j + 1 < n && j - 1 >= 0)
						if(node[j][i] == 0){
							node[j][i] = 1;
							if(doing(node, n, m, d) == a){
								System.out.println((i + 1) + " " + (j + 1));
								judge = true;
								break x;
							}
							node[j][i] = 0;
						}
					}
				}
				if(!judge) System.out.println(1);
			}
		}
		reader.close();
	}
	
	public static int doing(int node[][], int n, int s, int d){
		for(int i = 0; i < d; i++){
			if(s > 0 && node[s - 1][i] == 1) s--;
			else if(s < n - 1 && node[s][i] == 1) s++;
		}
		return s;
	}
}