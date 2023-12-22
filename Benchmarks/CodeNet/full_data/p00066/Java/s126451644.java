import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String[][] board = new String[3][3];
		int count=0;
		while((str=br.readLine())!=null){
			count=0;
			for(int i = 0 ; i < 3 ; i ++){
				for(int j = 0 ; j < 3 ; j ++){
					board[i][j]=String.valueOf(str.charAt(count));
					count++;
				}
			}
			String bool = check(board);
			System.out.println(bool);
		}
	}
	public static String check(String[][] b){
		for(int i = 0 ; i < 3 ; i ++){
			if(b[i][0].equals(b[i][1]) && b[i][1].equals(b[i][2])){
				if(!b[i][0].equals("s"))
					return b[i][0];
			}
			if(b[0][i].equals(b[1][i]) && b[1][i].equals(b[2][i])){
				if(!b[0][i].equals("s"))
					return b[0][i];
			}
		}
		if(b[1][1].equals("s"))
			return "d";
		if(b[0][0].equals(b[1][1])&& b[1][1].equals(b[2][2])){
			return b[0][0];
		}
		if(b[2][0].equals(b[1][1])&& b[1][1].equals(b[0][2])){
			return b[2][0];
		}
		return "d";		
	}
}