import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws Exception{
	int i = 0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String str_N = br.readLine();
	String str_A = br.readLine();
	System.out.println("");
	
	int[] A;
	A = new int[Integer.parseInt(str_N)];
	
	Scanner s = new Scanner(str_A).useDelimiter("\\s* \\s*");
	
	while(s.hasNext()){
	    A[i] = s.nextInt();
	    System.out.print(A[i]);
	    if(i != A.length){
		System.out.print(" ");
	    }
	    i++;
	}
	
	System.out.println("");
	
	for(int I = 1;I<A.length;I++){
	    int v = A[I];
	    int j = I - 1;
	    
	    while((j>=0) && (A[j]>v)){
		A[j+1] = A[j];
		j--;
	    }
	    A[j+1] = v;
	    for(i=0;i<A.length;i++){
		System.out.print(A[i]);
		if(i != A.length) System.out.print(" ");
		}
	    System.out.println("");
	}
	s.close();
    }
}

