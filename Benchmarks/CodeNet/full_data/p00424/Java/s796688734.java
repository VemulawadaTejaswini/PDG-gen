import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
	try{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int je, ix=0, sum=0;
	    int[] itu = new int[100];
	    String st;
	    ArrayList<String> ar = new ArrayList<String>();
	    Map<String,String> mp = new HashMap<String, String>();
	    
	    while(true){
		je = Integer.valueOf(br.readLine());
		if(je==0)
		    break;
		for(int j=0; j<je; j++){
		    st = br.readLine();
		    mp.put(st.substring(0,st.indexOf(" ")), st.substring(st.indexOf(" ")+1, st.length()));
		}
		je = Integer.valueOf(br.readLine());
		for(int j=0; j<je; j++){
		    st = br.readLine();
		    if(mp.containsKey(st))
			ar.add(mp.get(st));
		    else
			ar.add(st);
		}
		sum+=je;
		itu[ix] = sum;
		ix++;
	    }
	    ix=0;
	    for(int j=0; j<ar.size();j++){
		if(itu[ix]==j){
		    ix++;
		    System.out.println();
		}
		System.out.print(ar.get(j));
	    }
	    System.out.println();
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}