import java.util.*;

public class Main {

	static int[][] a = new int[101][2];
	static int[][] field;
	static int edgeCount;
	static int max;
	static boolean ok;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			ok=true;
			a = new int[101][2];
			int count=0;
			max = 0;
			while(true){
				a[count][0]=cin.nextInt();
				a[count][1]=cin.nextInt();
				if(a[count][0]+a[count][1]==0){
					break;
				}
				max = Math.max(Math.max(max, a[count][0]),a[count][1]);
				count++;
			}
			max++;
			edgeCount=count;
			field = new int[max][max];
			for(int i = 0; i < count;i++){
				field[a[i][0]][a[i][1]]++;
				field[a[i][1]][a[i][0]]++;
				//System.out.println(a[i][0]+" " + a[i][1]);
			}
			for(int i = 0; i < field.length;i++){
				for(int j = 0; j < field.length;j++){
					//System.out.print(field[i][j]);
				}
				//System.out.println();
			}
			dfs(1, 0);
			if(!ok){
				System.out.println("NG");
			}
		}
	}
	static void dfs(int start, int depth){
		if(!ok){
			return;
		}
		if(start==2&&depth==edgeCount){
			System.out.println("OK");
			ok=false;
			return;
		}
		for(int i = 1;i<max;i++){
			if(field[start][i]>=1){
				field[start][i]--;field[i][start]--;
				dfs(i,depth+1);
				field[start][i]++;field[i][start]++;
			}
		}
	}
}