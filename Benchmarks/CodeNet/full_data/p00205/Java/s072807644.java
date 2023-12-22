import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    int[] now = new int[5];
	    int[] sum;
	    ArrayList<Integer> map;
	    while(true){
		now[0] = Integer.valueOf(sc.readLine());
		if(now[0]==0)
		    break;
		sum = new int[3];
		sum[now[0]-1]++;
		map = new ArrayList<Integer>();
		map.add(now[0]);
		for(int i=1; i<5; i++){
		    now[i] = Integer.valueOf(sc.readLine());
		    map.add(now[i]);
		    sum[now[i]-1]++;
		}
		boolean flag = true;
		for(int i=0; i<3; i++)
		    if(sum[i]==0)
			flag = false;
		if(!flag)
		    for(int i=0; i<3; i++)
			if(sum[i]==5)
			    flag = true;
		if(flag)
		    for(int i=0; i<5; i++)
			System.out.println(3);
		else
		    for(int i=0; i<5; i++)
			if(map.contains((map.get(i)+1)%3))
			    System.out.println(1);
			else
			    System.out.println(2);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}