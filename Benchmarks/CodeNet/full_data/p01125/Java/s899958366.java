import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static int N,M;
	static int[][] field;
	static int[] v1={1,0,-1,0};
	static int[] v2={0,1,0,-1};
	static Map<String,Integer> map = new HashMap<String,Integer>();
	static{
		map.put("E", 0);
		map.put("N", 1);
		map.put("W", 2);
		map.put("S", 3);
		
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			N=cin.nextInt();
			if(N==0){
				break;
			}
			field=new int[21][21];
			for(int i = 0;i<N;i++){
				field[cin.nextInt()][cin.nextInt()]=1;
			}
			M=cin.nextInt();
			int x=10,y=10;
			if(field[10][10]==1){
				field[10][10]=0;
				N--;
			}
			for(int i = 0;i<M;i++){
				String s = cin.next();
				int dir = map.get(s);
				int len = cin.nextInt();
				for(int j = 0;j<len;j++){
					x+=v1[dir];
					y+=v2[dir];
					if(field[x][y]==1){
						N--;
						field[x][y]=0;
					}
				}
			}
			if(N==0){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}

	}

}