import java.util.Scanner;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		int[][] result = new int[100][2];
		int index = 0;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			int m = stdIn.nextInt();
			while( m != 0 ){
				int[][] search = new int[m][2];
				for(int i = 0; i < m; i++){
					search[i][0] = stdIn.nextInt();
					search[i][1] = stdIn.nextInt();
				}
				int n = stdIn.nextInt();
				int[][] map = new int[n][2];
				for(int i = 0; i < n; i++){
					map[i][0] = stdIn.nextInt();
					map[i][1] = stdIn.nextInt();
				}
				int i = 0;
				int count = 0;
				for(; i < n; i++){
					for(int j = 1; j < m; j++){
						int x = map[i][0]-search[0][0]+search[j][0];
						int y = map[i][1]-search[0][1]+search[j][1];
						for(int k = 0; k < n; k++){
							if( x == map[k][0] && y == map[k][1] ){
								count++;
								break;
							}
						}
					}
					if( count == m-1 ){
						result[index][0] = map[i][0]-search[0][0];
						result[index][1] = map[i][1]-search[0][1];
						break;
					} else {
						count = 0;
					}
				}
				index++;
				m = stdIn.nextInt();
			}
			
			for(int j = 0; j < index; j++){
				System.out.println(result[j][0] + " " + result[j][1]);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}