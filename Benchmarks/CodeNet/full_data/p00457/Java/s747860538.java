import java.io.*;
import java.util.*;

class Main{
    static void kowasu(int[] ini, int flag){
	int apa=1, minus=0, oke=ini[0];
	
	flag=0;
	for(int i=1; i<ini.length; i++){
	    if(ini[i]==-1)
		;
	    else if(ini[i] == oke)
		apa++;
	    else if(ini[i] != oke){
		oke=ini[i];
		if(apa>=4){
		    for(int m=minus; m<i; m++)
			ini[m]=-1;
		    flag=1;
		}
		minus=i;
		apa = 1;
	    }
	}
	
	if(flag==1)
	    kowasu(ini,flag);
	
    }
    
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
			kowasu(ini,1);
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