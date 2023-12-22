import java.io.*;
import java.util.Scanner;
class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br	=
				new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(new InputStreamReader(System.in));
		while(true){
			int n,m;
			n=scan.nextInt();
			m=scan.nextInt();
			if(m==0&&n==0)break;
			boolean[][] check=new boolean[n][m];
			char[][] data=new char[n][m];
			for(int i=0;i<n;i++){
					data[i]=br.readLine().toCharArray();
			}
			int i=0,j=0;
			while(true){
				if(check[i][j]){
					System.out.println("LOOP");
					break;
				}
				if(data[i][j]=='.'){
					System.out.printf("%d %d\n",j,i);
					break;
				}
				check[i][j]=true;
				int t_i=i,t_j=j;
				i=next_v(data[t_i][t_j],t_i);
				j=next_h(data[t_i][t_j],t_j);
			}
		}
	}
	public static int next_h(char data,int j){
		if(data=='>'){
			return j+1;
		}else if(data=='<'){
			return j-1;
		}
		return j;
	}
	public static int next_v(char data,int i){
		if(data=='^')
			return i-1;
		else if(data=='v')
			return i+1;
		return i;
	}
}