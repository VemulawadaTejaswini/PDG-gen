import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println(method1());
	}
	
	public static List<String> method2(String[][] a, int i, int j){
		List<String> b = new ArrayList<String>();
		
		for(int k = 0; k < 4; k++){
			try{
				switch(k){
					case 0:
						b.add(a[i][j-1]);
						//System.out.println(0);
						break;
						
					case 1:
						b.add(a[i-1][j]);
						//System.out.println(1);
						break;
						
					case 3:
						b.add(a[i+1][j]);
						//System.out.println(2);
						break;
						
					case 4:
						b.add(a[i][j+1]);
						//System.out.println(3);
						break;
				}
			}
			catch(Exception e){
				k++;
			}
		}
		
		return b;
	}
	
	public static String method1() throws IOException{
		System.out.println("Input: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String[] wh = str.split(" ");
		
		int w = Integer.parseInt(wh[0]);
		int h = Integer.parseInt(wh[1]);
		
		//System.out.print("\n");
		
		String[][] aaa = new String[w][h];
		
		for(int i = 0; i < h; i++){
			aaa[i] = br.readLine().split("");
			
			//for(String s: aaa[i]) System.out.print(s);
			
			//System.out.print("\n");
		}
		
		boolean flg = true;
		boolean flg2 = false;
		
		List<String> c;
		
		for(int i = 0; i < w; i++){
			for(int j = 0; j < h; j++){
				if(aaa[i][j].equals(".")) continue;
				
				c = method2(aaa, i, j);
				
				flg2 = false;
				
				for(String s: c){
					//System.out.print(s);
					if(s.equals("#")){ flg2 = true; }
				}
				
				//System.out.print(String.format("%d, %d\n", i, j));
			}
		}
		
		return flg2 ? "yes" : "no";
	}
}
