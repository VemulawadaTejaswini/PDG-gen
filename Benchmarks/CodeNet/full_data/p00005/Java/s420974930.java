import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
    public static void main(String args[]){
	String str;
	try{
	    InputStreamReader is = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(is);
	    int[] n = new int[2];
	    long[] l = new long[2];
	    int temp;
	    while(null != (str = br.readLine())){
		String[] strary = str.split(" ");
		n[0] = Integer.parseInt(strary[0]);
		n[1] = Integer.parseInt(strary[1]);
		l[0] = n[0];
		l[1] = n[1];
		while(n[0] != n[1]){
		    if(n[0] > n[1]){
			n[0] = n[0]-n[1];
		    }
		    else{
			n[1] = n[1]-n[0];
		    }
		}
		System.out.println(n[0]+" "+((l[0]*l[1])/n[0]));
	    }
	}
	catch(Exception e){
	    System.exit(0);
	}
    }
}