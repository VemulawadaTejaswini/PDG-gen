import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	int D[][];
	final int dir[][]={{1, 0}, {1, 1}, {0, 1}, {-1, 1}};
	int N;
	BufferedReader input;
	
	int ni() throws Exception {
		return Integer.parseInt(input.readLine());
	}
	
	String ns() throws Exception {
		return input.readLine();
	}
	
	int search(int i, int j, int d){
		if(i<0||i>=N||j<0||j>=N||D[i][j]==0) return 0;
		else return 1+search(i+dir[d][0], j+dir[d][1], d);
	}
	
	int solve(){
		int max=0;
		for(int i=0;i<N;++i){
			for(int j=0;j<N;++j){
				for(int d=0;d<4;++d){
					int k=search(i, j, d);
					max=max>k?max:k;
				}
			}
		}
		return max;
	}
	
	void setD() throws Exception{
		D=new int[N][N];
		for(int i=0;i<N;++i){
			String s=ns();
			for(int j=0;j<N;++j){
				char c=s.charAt(j);
				if(c=='1') D[i][j]=1;
				else if(c=='0') D[i][j]=0;
			}
		}
	}
	
	void io(){
		input=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			try {
				N=ni();
				if(N==0)break;
				setD();
				System.out.println(solve());
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}