import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h=sc.nextInt(),w=sc.nextInt();
    int[][] a=new int[h][w];
    boolean flag=true;
    for(int i=0;i<h;i++) {
    	String buff=sc.next();
    	for(int j=0;j<w;j++) {
    		if(buff.substring(j, j+1).equals("#"))a[i][j]=1;
    		else a[i][j]=0;
    	}
    }
    for(int i=0;i<h;i++) {
    	for(int j=0;j<w;j++) {
    		if(a[i][j]==1) {
	    		if(i==h-1 || j==w-1) {
	    			if(i==h-1&&j!=w-1) {
	    				if(a[i][j+1]==0)flag=false;
	    			}
	    			if(j==w-1&&i!=h-1) {
	    				if(a[i+1][j]==0)flag=false;
	    			}
	    		}else {
	    			if(a[i+1][j]==0 && a[i][j+1]==0)flag=false;
	    			if(a[i+1][j]==1 && a[i][j+1]==1)flag=false;
	    		}
    		}
    	}
    }
    if(flag) {
    	System.out.println("Possible");
    }else {
    	System.out.println("Impossible");
    }
  }
}
