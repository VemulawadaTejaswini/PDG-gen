import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    while(true){
		int n = Integer.valueOf(sc.readLine());
		if(n==0)
		    break;
		int[][] map = new int[n][n];
		for(int j=0; j<n; j++){
		    String sp = sc.readLine();
		    for(int i=0; i<n; i++)
			if(sp.charAt(i)=='*')
			    map[j][i]=1;
			else
			    map[j][i]=0;
		}
		
		int max=0;
		for(int j=0; j<n; j++)
		    for(int i=0; i<n; i++){
			while(i+max<n && j+max<n){
			    int com = max;
			    boolean flag = true;
			    root:
			    for(int l=0; l<max; l++)
				for(int k=0; k<max; k++)
				    if(map[j+l][i+k]==1){
					flag=false;
					break root;
				    }
			    if(flag)
				max++;
			    if(com == max)
				break;
			}
		    }
		System.out.println(max-1);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}