
import java.io.*;
class Main{
	 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws IOException{
    	   int n = Integer.parseInt(br.readLine());

    	int[] R=new int[n];
    	
    	for(int i=0;i<n;i++){
    		 R[i]=Integer.parseInt(br.readLine());
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