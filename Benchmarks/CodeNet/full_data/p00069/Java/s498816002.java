import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static boolean node[][];
	static int root[][];
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		String string;
		
		int n, m, d, ans, tmp;
		while(!(string = reader.readLine()).equals("0")){
			n = Integer.valueOf(string);
			m = Integer.valueOf(reader.readLine()) - 1;
			ans = Integer.valueOf(reader.readLine()) - 1;
			d = Integer.valueOf(reader.readLine());
			
			node = new boolean[n][n];
			root = new int[2][d];
			tmp = m;
			for(int i = 0; i < d; i++){
				char ch[] = reader.readLine().toCharArray();
				
				for(int j = 0; j < n - 1; j++){
					if(ch[j] == '1'){
						root[0][i] = j;
						
						node[j][j + 1] = true;
						node[j + 1][j] = true;
					}
				}
				if(tmp + 1 < n && node[tmp][tmp + 1]) tmp++;
				else if(tmp - 1 >= 0 && node[tmp][tmp - 1]) tmp--;
				
				root[1][i] = tmp;
			}
			
			if(ans == app.doing(0, m)){
				System.out.println(0);
				continue;
			}else{
				boolean judge = false;
				for(int i = 0; i < d - 1; i++){
					if(root[1][i] - 1 >= 0){
						if(ans == app.doing(i, root[1][i] - 1)){
							System.out.println(i + 1 + " " + (root[1][i] + 1));
							judge = true;
							break;
						}
					}else if(root[1][i] + 1 < n){
						if(ans == app.doing(i, root[1][i] + 1)){
							System.out.println(i + 1 + " " + (root[1][i] + 1));
							judge = true;
							break;
						}
					}
				}
				if(judge) continue;
			}
			System.out.println(1);
		}
		reader.close();
	}
	
	public int doing(int n, int ing){
		int len = node.length;
		for(int i = n + 1; i < len; i++){
			if(ing + 1 < len && node[ing][ing + 1]) ing++;
			else if(ing - 1 >= 0 && node[ing][ing - 1]) ing--;
		}
		return ing;
	}
}