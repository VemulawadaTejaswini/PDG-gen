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
		
		for(int k = 0; k < 4; k++){
			if(j == 0 && k == 0) continue;
			if(i == 0 && k == 1) continue;
			if(i == h - 1 && k == 2) continue;
			if(j == w - 1 && k == 3) continue;
			
			//try{
				switch(k){
				case 0:
					if(a[i][j-1].equals("#")) b = true;
					break;
				case 1:
					if(a[i-1][j].equals("#")) b = true;
					break;
				case 2:
					if(a[i+1][j].equals("#")) b = true;
					break;
				case 3:
					if(a[i][j+1].equals("#")) b = true;
					break;
				}
			//}
			//catch(Exception e){
				//k++;
			//}
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
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		//System.out.println(str);
		String[] wh = str.split(" ");
		
		int w = Integer.parseInt(wh[0]);
		int h = Integer.parseInt(wh[1]);
		
		//System.out.print("\n");
		
		String[][] aaa = new String[w][h];
		
		for(int i = 0; i < h; i++)
			try {
				aaa[i] = br.readLine().split("");
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		
		boolean flg = true;
		
		//int count = 0;
		
		for(int i = 0; i < w; i++){
			for(int j = 0; j < h; j++){
				if(aaa[i][j].equals(".")) continue;
				
				flg = method3(aaa, i, j);
				
				if(!flg) break;
				
				//count++;
			}
			
			if(!flg) break;
		}
		
		//System.out.println("Count: " + count);
		System.out.println(flg ? "Yes" : "No");
	}
}
