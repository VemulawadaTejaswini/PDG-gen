import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws Exception{
	int i = 0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String str_A = br.readLine();

	int[] A;
	A = new int[2];
	
	Scanner s = new Scanner(str_A).useDelimiter("\\s* \\s*");
	
	while(s.hasNext()){
	    A[i] = s.nextInt();
	    i++;
	}
	
	while(Math.min(A[0],A[1]) != 0){
	    int x,y;
	    x = Math.min(A[0],A[1]);
	    y = Math.max(A[0],A[1]) % x;
	    A[0] = x;
	    A[1] = y;
	}
	System.out.println(Math.max(A[0],A[1]));
	return ;
    }
}

	

