import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws Exception{
	int i=0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String str_n = br.readLine();
	String str_A = br.readLine();
	String str_q = br.readLine();
	String str_M = br.readLine();

	int n = Integer.parseInt(str_n);
	int q = Integer.parseInt(str_q);

	int[] A = new int[n];
	int[] M = new int[q];

	Scanner sc_A = new Scanner(str_A).useDelimiter("\\s* \\s*");
	Scanner sc_M = new Scanner(str_M).useDelimiter("\\s* \\s*");

	while(sc_A.hasNext()){
	    A[i] = sc_A.nextInt();
	    i++;
	}

	i = 0;//カウント初期化

	while(sc_M.hasNext()){
	    M[i] = sc_M.nextInt();
	    i++;
	}

	for(i=0;i<q;i++){
	    int m = M[i];
	    System.out.println(exhausitiveSearch(n,A,q,m));
	}

	sc_A.close();
	sc_M.close();
    }
    
    private static String exhausitiveSearch(int n,int A[], int q, int m){
	int flag = 0;
	
	for(int i=0;i<n;i++){
	    int COUNT = 0;
	    for(int j=i+1;j<n;j++){
		if(m == A[i] + A[j]){
		    flag = 1;
		    break;
		}
		COUNT++;
	    }
	    if(COUNT == 1) break; 
	}
	
	if(flag == 1) return "yes";
	else return "no";
    }
}

