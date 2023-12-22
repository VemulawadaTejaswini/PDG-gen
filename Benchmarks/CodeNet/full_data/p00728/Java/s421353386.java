import java.io.*;
import java.util.Arrays;
 
class Main {
 
	static InputStreamReader isr;
	static BufferedReader br;
	
	public static void main(String args[]) throws IOException{
	    isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);
		
		int c;
		while ((c = getint() ) != -1){
		    if (c!=0){
                int[] arr = getData(c);
                Arrays.sort(arr);
                System.out.println( averageP(arr) );
		    }else{
                System.out.println("");
            }
        }
	}
	static int getint(){
	    try{
	        int n = 0;
			String buf = br.readLine();
			n=Integer.parseInt(buf);
			return n;
		}catch(Exception e){
		    return -1;
		}
	}
	static int[] getData(int n){
	    try{
    	    int[] r = new int[n];
    	    for(int i=0; i<n; i++){
    	        r[i] = Integer.parseInt(br.readLine());
    	    }
    	    return r;
	    }catch(Exception e){
	        return new int[]{};
	    }
	}
	static int averageP(int[] r){
	    if(r.length > 2){
	        int sum = 0;
	        for(int i=1; i<(r.length-1); i++){
	            sum += r[i];
	        }
	        sum = sum / (r.length - 2);
	        return sum;
	    }else{
	        return 0;
	    }
	}
}