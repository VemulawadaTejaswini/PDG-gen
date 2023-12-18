
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int large = scanner.nextInt();
		//System.out.println(large);
		int small = scanner.nextInt();
		
		char tableL[][] = new char[large][large];
		char tableS[][] = new char[small][small];
		
		for(int i = 0; i < tableL.length; i++){
			String tmp = scanner.next();
			for(int j = 0; j < tableL[i].length; j++){
				tableL[i][j] = tmp.charAt(j);
			}
		}
		
		
		for(int i = 0; i < tableS.length; i++){
			String tmp = scanner.next();
			for(int j = 0; j < tmp.length(); j++){
				tableS[i][j] = tmp.charAt(j);
			}
		}
		
		
		
		for(int i = 0; i < large - small + 1; i++){
			for(int j = 0; j < large - small + 1; j++){
				// ここまでのループで、小さい正方形の左上の座標を網羅する。
				boolean flag = true;
				
				// 関数化しないので注意
				
				for(int k = 0; k < small; k++){
					for(int l = 0; l < small; l++){
						// ここまでのループで指定された左上の座標からの位置を示す。
						//System.out.println("L = " + tableL[i + k][j + l] + " S = " + tableS[k][l]);
						if(tableL[i + k][j + l] != tableS[k][l]){
							flag = false;
							//System.out.println(">> i = " + i + " j = " + j + " k = " + k + " l = " + l);
							break;
						}
					}
					if(flag == false){
						break;
					}
				}
				if(flag == true){
					System.out.println("Yes");
					return;
				}
				
				// 関数の終了
				
				if(flag == false){
					break;
				}
			}
		}
		
		System.out.println("No");
	}
}