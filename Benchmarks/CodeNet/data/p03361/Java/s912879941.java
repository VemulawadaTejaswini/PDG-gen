import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		method1();
	}
	
//	public static List<String> method2(String[][] a, int i, int j){
//		List<String> b = new ArrayList<String>();
//		
//		for(int k = 0; k < 4; k++){
//			try{
//				switch(k){
//					case 0:
//						b.add(a[i][j-1]);
//						//System.out.println(0);
//						break;
//						
//					case 1:
//						b.add(a[i-1][j]);
//						//System.out.println(1);
//						break;
//						
//					case 3:
//						b.add(a[i+1][j]);
//						//System.out.println(2);
//						break;
//						
//					case 4:
//						b.add(a[i][j+1]);
//						//System.out.println(3);
//						break;
//				}
//			}
//			catch(Exception e){
//				k++;
//			}
//		}
//		
//		return b;
//	}
	
	public static boolean method3(String[][] a, int i, int j){
		boolean b = false;
		
		int w = a[0].length;
		int h = a.length;
		final String c = "#";
		
		for(int k = 0; k < 4; k++){
			if(j == 0 && k == 0) continue;
			if(i == 0 && k == 1) continue;
			if(i == h - 1 && k == 2) continue;
			if(j == w - 1 && k == 3) continue;
			
			
			switch(k){
				case 0:
					if(a[i][j-1].equals(c)) b = true;
					break;
				case 1:
					if(a[i-1][j].equals(c)) b = true;
					break;
				case 2:
					if(a[i+1][j].equals(c)) b = true;
					break;
				case 3:
					if(a[i][j+1].equals(c)) b = true;
					break;
			}
			
			if(b) break;
		}
		
		return b;
	}
	
	public static void method1(){
		//System.out.println("Input: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String[] wh = str.split(" ");
		
		int w = Integer.parseInt(wh[0]);
		int h = Integer.parseInt(wh[1]);
		
		String[][] aaa = new String[w][h];
		
		for(int i = 0; i < h; i++){
			try {
				aaa[i] = br.readLine().split("");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		boolean flg = false;
		boolean finFlg = false;
		
		for(int i = 0; i < w; i++){
			for(int j = 0; j < h; j++){
				if(aaa[i][j].equals(".")) continue;
				
				flg = method3(aaa, i, j);
				
				if(!flg) finFlg = true; 
				
				if(finFlg) break;
			}
			
			if(finFlg) break;
		}
		
		System.out.println(flg ? "Yes" : "No");
	}
}
