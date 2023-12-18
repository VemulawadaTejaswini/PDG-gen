import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static int point=sc.nextInt();
	private static int line=sc.nextInt();
	private static int[][] a=new int[point+1][point+1];
	private static int counter=0;
	private static int[] visited=new int[point+1];
	public static void main(String[] args){
		for(int i=0;i<line;i++){
			int pa=sc.nextInt();
			int pb=sc.nextInt();
			a[pa][pb]=1;
			a[pb][pa]=1;
		}
		visited[1]=1;
		visit(1);
		System.out.println(counter);
	}
	private static void visit(int i){
		int sum=0;
		for(int k=1;k<=point;k++){
			sum+=visited[k];
		}
		if(sum==point){ 
			counter++;
			return;
		}
		for(int j=1;j<=point;j++){
			if(a[i][j]==1&&visited[j]==0){
				visited[j]=1;
				visit(j);
				visited[j]=0;
			}
		}
	}
}