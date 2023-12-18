
import java.util.*;


public class Main{ 
	static int height[]=new int[100001];
   public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int m=s.nextInt();
	 ArrayList<ArrayList<Integer>> arr=new ArrayList<>(n+1);
	 for(int i=0;i<=n;i++) {
		 ArrayList<Integer> temp=new ArrayList<>();
		 arr.add(temp);
	 }
	 
	 for(int i=0;i<m;i++) {
		 int x=s.nextInt();
		 int y=s.nextInt();
		 arr.get(x).add(y);
	 }
	 boolean visited[]=new boolean[n+1];
	
	 for(int i=1;i<=n;i++) {
		 if(!visited[i])
	   dfs(arr,i,0,visited);
	 }
	 int ans=0;
	 for(int i=0;i<=n;i++) {
		 if(ans<height[i]) {
			 ans=height[i];
		 }
	 }
	 System.out.print(ans-1);
	 
   }
   public static void dfs(ArrayList<ArrayList<Integer>> arr,int start,int parent,boolean visited[]) {
	   visited[start]=true;
	  
	   
	   ArrayList<Integer> temp=arr.get(start);
	   for(int i=0;i<temp.size();i++) {
		   if(!visited[temp.get(i)]) {
			   dfs(arr,temp.get(i),start,visited);
		   }
	   }
	 
	   for(int i=0;i<temp.size();i++) {
		   height[start]=Math.max(height[start], height[temp.get(i)]);
	   }
	   height[start]=1+height[start];
	   
	   
   }
}