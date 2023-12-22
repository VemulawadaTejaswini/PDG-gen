import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
class Main{
	 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws IOException{
    	   int n = Integer.parseInt(br.readLine());
    	//final int MAX =200000;
    	 /*  try {
     final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	final int n = Integer.parseInt(reader.readLine());*/
    	//Scanner sc = new Scanner(System.in);
    	//int n = Integer.parseInt(sc.next());
    	//int n =sc.nextInt();
    	int[] R=new int[n];
    	
    	for(int i=0;i<n;i++){
    		// R[i]=Integer.parseInt(sc.next());
    		 R[i]=Integer.parseInt(br.readLine());
    	}
    	int maxv=-2000000000;
    			 
    	int minv=R[0];
    	for(int i=1;i<n;i++){
    		maxv=Math.max(maxv,R[i]-minv);
    		minv=Math.min(minv,R[i]);
    	}
    	System.out.println(maxv);
        /*reader.close();*/
/*        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}