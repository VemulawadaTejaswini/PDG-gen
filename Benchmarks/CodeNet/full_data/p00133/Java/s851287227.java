import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		char map[][] = new char[8][8];
		for(int i = 0; i < 8; i++){
			char ch[] = reader.readLine().toCharArray();
			for(int j = 0; j < 8; j++){
				map[i][j] = ch[j];
			}
		}
		System.out.println(90);
		for(int i = 7; i >= 0; i--){
			for(int j = 0; j < 8; j++){
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		System.out.println(180);
		for(int i = 7; i >= 0; i--){
			for(int j = 7; j >= 0; j--){
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		System.out.println(270);
		for(int i = 0; i < 8; i++){
			for(int j = 7; j >= 0; j--){
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		reader.close();
	}
}