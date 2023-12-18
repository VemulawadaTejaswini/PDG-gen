import java.util.*;
public class Main{
	private static Scanner scan = new Scanner(System.in);
	public static void train(){
		int N = scan.nextInt(), i = scan.nextInt();
		System.out.println(N-i+1);
	}
	public static void gritCompression(){
		int H = scan.nextInt(), W = scan.nextInt();
		char[][] array = new char[H][W];
		
		//入力
		for(int i=0;i<H;i++){
			array[i] = scan.next().toCharArray();
		}
		System.out.println();
		
		ArrayList<Integer> line = new ArrayList<>(); //出力しない列
		ArrayList<Integer> row = new ArrayList<>();  //出力しない行
		
		//行のみ見る
		for(int i=0;i<H;i++){
			boolean flag = false;
			for(int j=0;j<W;j++){
				if(array[i][j]=='#'){
					flag = true;
					break;
				}
			}
			if(flag){row.add(i);}
		}
		
		//列を見る．
		for(int j=0;j<W;j++){
			boolean flag = false;
			for(int i=0;i<H;i++){
				if(array[i][j]=='#'){
					flag = true;
					break;
				}
			}
			if(flag){
				line.add(j);
			}
		}
		
		//出力
		for(int i=0;i<H;i++){
			if(row.contains(i)){
				for(int j=0;j<W;j++){
					if(line.contains(j)){
						System.out.print(array[i][j]);
					}
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] argv){
		gritCompression();
	}
}