import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int cnt;
		Boolean flag = false;
		char[][] str = new char[h][w];
		int [][] wea = new int[h][w];
		for(int i = 0; i < h; i++){
			str[i] = sc.next().toCharArray();
		}
		for(int i = 0; i < h; i ++){
			cnt = -1;
			flag = false;
			for(int k = 0; k < w; k++){
				if(str[i][k] == 'c'){
					cnt = 0;
					flag = true;
				}
				else if(str[i][k] == '.' && flag == true) cnt++;
				else if(str[i][k] == '.')cnt = -1;
				wea[i][k] = cnt;
			}
		}
		for(int i = 0; i < h; i++){
			for(int k = 0; k < w; k++){
				System.out.print(wea[i][k]);
				if(k + 1 != w) System.out.print(" "); 
			}
			System.out.println("");
		}
	}
}