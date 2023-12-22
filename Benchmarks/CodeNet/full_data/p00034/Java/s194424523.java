import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Main{ 
    
    public static void main(String[] args)throws IOException{
	try{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	String line;
	while((line=br.readLine())!=null){
	    StringTokenizer st=new StringTokenizer(line,",");
	    int[] sta = new int[10];
	    int tra1,tra2;
	    for(int i=0;i<10;i++)
		sta[i]=Integer.parseInt(st.nextToken());
	    tra1=Integer.parseInt(st.nextToken());
	    tra2=Integer.parseInt(st.nextToken());
	    int sum=0;
	    for(int i=0;i<10;i++)
		sum+=sta[i];
	    double t =(double) sum/(tra1+tra2);
	    //	     System.out.println(t+" "+sum);
	    sum=0;
	    for(int i=0;i<10;i++){
		if(tra1*t>sum&&tra1*t<=(sum+sta[i]))
		    System.out.println(i+1);
		sum+=sta[i];
	    }
	}
	}catch(java.lang.NumberFormatException e){
	    System.out.println(e);
	}
	
    }
}