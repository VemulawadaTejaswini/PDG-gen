import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    TreeMap<Integer, Integer> map;
	    while(true){
		String[] st = sc.readLine().split(" ");
		int N = Integer.valueOf(st[0]);
		int Q = Integer.valueOf(st[1]);
		if((N|Q)==0)
		    break;
		map = new TreeMap<Integer, Integer>();
		int max = 0, dt = 0;
		boolean flag = true;
		for(int i=0; i<N; i++){
		    String[] su = sc.readLine().split(" ");
		    int M = Integer.valueOf(su[0]);
		    for(int j=1; j<=M; j++){
			int date = Integer.valueOf(su[j]);
			if(!map.containsKey(date)){
			    map.put(date,1);
			    if(flag){
				max = 1; dt = date; flag = false;
			    }
			}
			else{
			    int r = map.get(date);
			    map.remove(date);
			    map.put(date,r+1);
			    if(r+1>max){
				max = r+1; dt = date;
			    }
			}
		    }
		}
		if(max>=Q)
		    System.out.println(dt);
		else
		    System.out.println(0);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}