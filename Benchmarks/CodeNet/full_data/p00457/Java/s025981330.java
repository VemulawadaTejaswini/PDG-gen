import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	try{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    ArrayList<Integer> array = new ArrayList<Integer>();
	    
	    do{
		int min, minloc, je = Integer.valueOf(br.readLine());
		int[] init = new int[je];
		
		min = je;
		if(je==0)
		    break;
		for(int i=0; i<je; i++)
		    init[i] = Integer.valueOf(br.readLine());
		
		for(int i=0; i<je; i++){
		    for(int pet=1; pet<4; pet++){
			int[] ini = init.clone();
			ini[i]=pet;
			
			int apa=1, minus=0, flag=1, oke=ini[0];
			while(flag==1){
			    flag=0;
			    for(int ip=1; ip<ini.length; ip++){
				if(ini[ip]==-1)
				    ;
				else if(ini[ip] == oke)
				    apa++;
				else if(ini[ip] != oke){
				    oke=ini[ip];
				    if(apa>=4){
					for(int m=minus; m<ip; m++)
					    ini[m]=-1;
					flag=1;
				    }
				    minus=ip;
				    apa = 1;
				}
			    }
			}
			
			minloc=0;
			for(int kk=0; kk<je; kk++)
			    if(ini[kk]!=-1)
				minloc++;
			if(minloc<min)
			    min=minloc;
		    }
		}
		array.add(min);
	    }while(true);
	    
	    for(int u=0; u<array.size(); u++)
		System.out.println(array.get(u));
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}