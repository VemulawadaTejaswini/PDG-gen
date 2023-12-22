import java.io.*;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
	BufferedReader br
	    = new BufferedReader(new InputStreamReader(System.in), 1);
	int n;
	int[] array;
	String[] tmp = null;

	try{
	    n = Integer.parseInt(br.readLine());
	    tmp = br.readLine().split(" ");
	}catch(IOException e){
	    e.getStackTrace();
	}
	if(tmp == null)
	    System.exit(1);

	array = new int[tmp.length];
	for(int i=0; i<tmp.length; i++){
	    array[i] = Integer.parseInt(tmp[i]);
	}
	    
	
	//sort
	int t;
	int cnt = 0;
	for(int i = 0; i < array.length; i++){
	    for(int j = array.length-1; j > i; j--){
		if( array[j] < array[j-1]){
		    t = array[j];
		    array[j] = array[j-1];
		    array[j-1] = t;
		    cnt++;
		}
	    }
	}
	for(int i = 0; i < array.length; i++)
	    System.out.print(array[i] + (i != array.length-1 ? " " : "\n") );
	System.out.println(cnt);
    }
}