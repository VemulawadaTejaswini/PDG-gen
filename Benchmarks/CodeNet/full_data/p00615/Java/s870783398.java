import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws IOException{
	BufferedReader br = null;
	try{
	    br = new BufferedReader(new InputStreamReader(System.in));
	    while(true){
		String[] buf;
		buf = br.readLine().split(" ");
		int length;
		length = Integer.parseInt(buf[0]) + Integer.parseInt(buf[1]);
		if (length == 0)break;
		int[] time = new int[length];
		buf = br.readLine().split(" ");
		int size = buf.length;
		for(int i = 0 ; i < size; i++){
		    time[i] = Integer.parseInt(buf[i]);
		}
		buf = br.readLine().split(" ");
		for(int i = size ; i < size + buf.length; i++){
		    time[i] = Integer.parseInt(buf[i - size]);
		}
		Arrays.sort(time);
		int max = time[0];
		for(int i = 0;i<time.length -1;i++){
		    max = Math.max(max , time[i+1] - time[i]);
		}
		System.out.println(max);
	    }
	}finally{
	    if(br !=null)br.close();
	}
    }
}
		