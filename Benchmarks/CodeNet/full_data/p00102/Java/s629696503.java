import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		final String sf = " ";
		final String s = " ";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int i = Integer.parseInt(in.readLine());
			if(i == 0){
				break;
			}
			else{
				String[][] is = new String [i][i];
				int[] r = new int[i];
				int[] g = new int[i+1];
				Arrays.fill(r, 0);
				Arrays.fill(g, 0);
				
				for(int x = 0; x < i ;x++){
					String[]  ss = in.readLine().split(s);
					for(int y = 0;y < i;y++){
						int a = Integer.parseInt(ss[y]);
						is[x][y] = ss[y];
						r[x] =r[x] + a;
						g[y] =g[y] + a;
						g[i] =g[i] + a;
					}
				}
				for(int x = 0 ; x < i ; x++){
					for(int y = 0 ; y < i ; y++){
						for(int z = 0; z < 5 - is[x][y].length(); z++){
							System.out.print(sf);
						}
						System.out.print(is[x][y]);
					}
					for(int z = 0; z < 5 - String.valueOf(r[x]).length(); z++){
						System.out.print(sf);
					}
					System.out.print(r[x]);
					System.out.println();
				}
				for(int x = 0 ; x < i+1 ; x++){
					for(int z = 0; z < 5 - String.valueOf(g[x]).length(); z++){
						System.out.print(sf);
					}
					System.out.print(g[x]);
				}
				System.out.println();
			}
			
		}
		

	}

}