import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(true){
			int counter = 0;
			int N = sc.nextInt();
			int M = sc.nextInt();
			if(N==0&&M==0) break;
			String input;
			char[][] test = new char[N+2][M+2];
			for(int i=0;i<(M+2);i++){
				test[0][i] = '.';
				test[N+1][i] = '.';
			}
			for(int i=0;i<(N+2);i++){
				test[i][0] = '.';
				test[i][M+1] = '.';
			}
			for(int i=1;i<N+1;i++){
				input = sc.next();
				for(int j=1;j<M+1;j++){
					test[i][j] = input.charAt(j-1);
				}
			}
			for(int i=1;i<N+1;i++){
				for(int j=1;j<M+1;j++){
					if(test[i][j]!='.'){
						test = dfs(i,j,test);
						counter++;
					}
				}
			}
			System.out.print(counter);
		}
	}
	private static char[][] dfs(int x,int y,char[][] test){
		char buf = test[x][y];
		test[x][y] ='.';
		if(buf!='.'){
			if(buf==test[x-1][y]){
				test = dfs(x-1,y,test);
			}
			if(buf==test[x+1][y]){
				test = dfs(x+1,y,test);
			}
			if(buf==test[x][y-1]){
				test = dfs(x,y-1,test);
			}
			if(buf==test[x][y+1]){
				test = dfs(x,y+1,test);
			}
		}
		return test;
	}
}