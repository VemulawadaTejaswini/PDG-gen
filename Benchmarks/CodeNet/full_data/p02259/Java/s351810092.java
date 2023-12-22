import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws Exception{
	int i = 0;
	int tmp;
	int Count_Sort = 0;
	boolean flag = true;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String N_str = br.readLine();
	int N = Integer.parseInt(N_str);

	int[] A;
	A = new int[N];
	
	String A_str = br.readLine();
	Scanner sc = new Scanner(A_str).useDelimiter("\\s* \\s*");
	
	while(sc.hasNext()){
	    A[i] = sc.nextInt();
	    i++;
	}

	i = 0;
	
	while(flag){
	    flag = false;
	    for(int j=N-1;i<j;j--){
		if(A[j]<A[j-1]){
		    tmp = A[j];
		    A[j] = A[j-1];
		    A[j-1] = tmp;
		    flag = true;
		    Count_Sort++;
		}
	    }
	    i++;
	}
	
	for(i=0;i<N;i++){
	    System.out.print(A[i]);
	    if(i!=N-1) System.out.print(" ");
	}
	
	System.out.println("");
	System.out.println(Count_Sort);
	sc.close();
    }
}
