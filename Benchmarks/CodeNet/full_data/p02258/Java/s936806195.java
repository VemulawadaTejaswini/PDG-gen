import java.util.*;
class Main{
    public static void main(String[] args){
    	final int MAX =200000;
    	int R[]=new int[MAX];
    	int n;
    	Scanner sc = new Scanner(System.in);
    	n=sc.nextInt();
    	Scanner sc1 = new Scanner(System.in);
    	for(int i=0;i<n;i++){
    		 R[i]=sc1.nextInt();
    		 //System.out.println(R[i]);
    	}
    	int maxv=-2000000000;
    			 
    	int minv=R[0];
    	for(int i=1;i<n;i++){
    		maxv=Math.max(maxv,R[i]-minv);
    		minv=Math.min(minv,R[i]);
    	}
    	System.out.println(maxv);
    	
    }
}