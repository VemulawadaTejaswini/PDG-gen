import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
	    while(!"0 0 0".equals(line)){
	        String[] lines = line.split(" ");
            List<Integer> list = new ArrayList<Integer>();
            list.add(Integer.parseInt(lines[0]));
            list.add(Integer.parseInt(lines[1]));
            list.add(Integer.parseInt(lines[2]));
            Collections.sort(list);
	        int mid = (int)list.get(list.size()/2);
	        int min = (int)list.get(0);
	        int size = (int)Math.sqrt(mid*mid+min*min);
	        int n = Integer.parseInt(br.readLine());
	        for(int i=0;i<n;i++){
	            int a = Integer.parseInt(br.readLine());
	            if(a*2>size){
	                System.out.println("OK");
	            }else{
	                System.out.println("NA");
	            }
	        }
	        
	        line = br.readLine();
	    }
    }
}