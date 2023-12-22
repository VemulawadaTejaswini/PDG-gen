import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	BufferedReader input;
	int field[][];
	final int N=3;
	final int dir[][]={{1, 0}, {1, 1}, {0, 1}, {-1, 1}};
	
	int search(int i, int j, int d, char c){
		if(i<0||i>=N||j<0||j>=N||field[i][j]!=c) return 0;
		else return 1+search(i+dir[d][0], j+dir[d][1], d, c);
	}
	
	int length(char c){
		int max=0;
		for(int i=0;i<N;++i){
			for(int j=0;j<N;++j){
				for(int d=0;d<4;++d){
					int k=search(i, j, d, c);
					max=max>k?max:k;
				}
			}
		}
		return max;
	}
	
	
	char solve(){
		if(length('o')==3) return 'o';
		else if(length('x')==3) return 'x';
		else return 'd';
	}
	
	void makeField(String s){
		field=new int[3][3];
		for(int i=0;i<9;++i){
			field[i/3][i%3]=s.charAt(i);
		}
	}
	
	void io(){
		input=new BufferedReader(new InputStreamReader(System.in));
		String s;
		try {
			while((s=input.readLine())!=null){
				makeField(s);
				System.out.println(solve());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}