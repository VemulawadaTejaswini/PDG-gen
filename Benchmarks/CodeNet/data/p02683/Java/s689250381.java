import java.util.Scanner;
public class Main{ 
  
  	static long min=-1;
  	static int n, m, x;
	public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
       n =sc.nextInt();
       m=sc.nextInt();
       x=sc.nextInt();
      
      int skill[]=new int[m+1];
      int grid[][]=new int[n+1][m+1];
      for(int i=1;i<=n;i++){
      	for(int j=0;j<=m;j++){
        	grid[i][j]=sc.nextInt();       
        }
      }
      
      rec(1,skill,grid,0);
      System.out.println(min);
    }
  
  	static void rec(int i,int skill[],int grid[][],long cost){
    	if(i>n) return;
      	int skill2[]=new int[m+1];
      	boolean flag1=true;
      	for(int j=1;j<=m;j++){
          skill2[j]=skill[j]+grid[i][j];
          if(skill2[j]<x) flag1=false;
        }
      	if(flag1){
        	if(min == -1 || cost+grid[i][0] < min) min=cost+grid[i][0];
        }
      	//if i select this book
      	if(!flag1)
      	rec(i+1,skill2,grid,cost+grid[i][0]);
      
      	//don't select
      	rec(i+1,skill,grid,cost);    
    }
}