import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int u = scan.nextInt();
			int[][] graph = new int[u][u];
			for(int i = 0;i < u;i++){
				int v = scan.nextInt();
				int e = scan.nextInt();
				for(int j = 0;j < e;j++){
					graph[v-1][scan.nextInt()-1] = 1;
				}
			}
			for(int i = 0;i < u;i++){
				for(int j = 0;j < u;j++){
					System.out.print(graph[i][j] + ((j != u-1)?" ":"\n"));
				}
			}
		}
	}
}