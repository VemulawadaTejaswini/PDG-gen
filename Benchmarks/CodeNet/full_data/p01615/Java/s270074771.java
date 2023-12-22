import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	static int maxtimes;
	public static void main(String args[]){
		Scanner stdin = new Scanner(System.in);
		int[][] road;
		int[][] time;
		int n,m;
		n=stdin.nextInt();
		m=stdin.nextInt();
		road=new int[n][m];
		time=new int[n][m];
		ArrayList<Integer> path=new ArrayList<Integer>();
		for(int i=0;i<m;i++){
			int p,r;
			r=stdin.nextInt();
			p=stdin.nextInt();
			road[r][p]=p;
			time[r][p]=stdin.nextInt();
			
		}
		path.add(0);
		int times=0,max=0;
		
		System.out.println(findAll(0,n-1,road,time,path,times));
	}
	
	public static int findAll(int start,int end,int [][] road,int[][] time,ArrayList<Integer> path,int times){
		
		for(int node:road[start]){
			if(node>0){
				if(node==end){
					if(times+time[start][node]>maxtimes) maxtimes=times+time[start][node];
					
					
				}else{
					path.add(node);
					times+=time[start][node];
					findAll(node,end,road,time,path,times);
					times-=time[start][node];
					
					
					path.remove(path.size()-1);
				}
				continue;
			}
		}
		return maxtimes;
	}
	
	
}