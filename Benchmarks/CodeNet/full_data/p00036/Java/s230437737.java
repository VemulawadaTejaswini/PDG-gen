import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str,strArray[];

		Loop:
		while(true){
			char map[][] = new char[8][8];
			int si=0,sj=0;

			for(int i=0; i<8; i++){
				str = br.readLine();
				if(str == null){
					break Loop;
				}
				map[i] = str.toCharArray();
			}

			SEARCH:
			for(int i=0; i<8; i++){
				for(int j=0; j<8; j++){
					if(map[i][j] == '1'){
						si=i;
						sj=j;
						break SEARCH;
					}
				}
			}

			judgeA(map, si, sj);
			judgeB(map, si, sj);
			judgeC(map, si, sj);
			judgeD(map, si, sj);
			judgeE(map, si, sj);
			judgeF(map, si, sj);
			judgeG(map, si, sj);

		}
	}

	static void judgeA(char c[][], int i, int j){
		try{
			if(c[i+1][j] == '1' && c[i+1][j+1] == '1'){
				System.out.println("A");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			return;
		}
	}

	static void judgeB(char c[][], int i, int j){
		try{
			if(c[i+3][j] == '1'){
				System.out.println("B");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			return;
		}
	}

	static void judgeC(char c[][], int i, int j){
		try{
			if(c[i][j+3] == '1'){
				System.out.println("C");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			return;
		}
	}

	static void judgeD(char c[][], int i, int j){
		try{
			if(c[i-1][j+2] == '1'){
				System.out.println("D");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			return;
		}
	}

	static void judgeE(char c[][], int i, int j){
		try{
			if(c[i+1][j+2] == '1'){
				System.out.println("E");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			return;
		}
	}

	static void judgeF(char c[][], int i, int j){
		try{
			if(c[i+2][j+1] == '1'){
				System.out.println("F");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			return;
		}
	}

	static void judgeG(char c[][], int i, int j){
		try{
			if(c[i][j+1] == '1' && c[i+1][j-1] == '1'){
				System.out.println("G");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			return;
		}
	}

}