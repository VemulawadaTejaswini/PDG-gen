import java.util.*;
class Main{
    public static void main(String[] args){
    	//final int MAX =200000;
    	
    	int n;
    	Scanner sc = new Scanner(System.in);
    	n=sc.nextInt();
    	int R[]=new int[n];
    	Scanner sc1 = new Scanner(System.in);
    	for(int i=0;i<n;i++){
    		 R[i]=sc1.nextInt();
    	}
    	int maxv=-2000000000;
    	int minv=R[0];
    	for(int j=1;j<n;j++){
    		maxv=Math.max(maxv,R[j]-minv);
    		minv=Math.min(minv,R[j]);
    	}
    	System.out.print(maxv);
    	
    }
}