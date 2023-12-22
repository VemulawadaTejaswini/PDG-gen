import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws Exception{
	int[] S;
	int[] T;
	int i=0;
	int j=0;
	int FOUND=0;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String str_n = br.readLine();
	String str_S = br.readLine();//data_and_key
	String str_q = br.readLine();
	String str_T = br.readLine();//key_stack

	int n = Integer.parseInt(str_n);
	int q = Integer.parseInt(str_q);
	S = new int[n+1];//S[n] = key
	T = new int[q];

	Scanner sc_S = new Scanner(str_S).useDelimiter("\\s* \\s*");
	Scanner sc_T = new Scanner(str_T).useDelimiter("\\s* \\s*");

	while(sc_S.hasNext()){
	    S[i] = sc_S.nextInt();
	    i++;
	}

	while(sc_T.hasNext()){
	    T[j] = sc_T.nextInt();
	    j++;
	}

	FOUND = linearSearch(n,S,q,T);

	System.out.println(FOUND);
	
	sc_S.close();
	sc_T.close();

    }

    private static int linearSearch(int n,int S[],int q,int T[]){
	int NOT_FOUND = 0;
	int FOUND_COUNT = 0;
	for(int j=0;j<T.length;j++){
	    int i=0;
	    int key = T[j];
	    S[n] = key;
	    while(S[i] != key) i++;
	    if(i==n) break;
	    FOUND_COUNT++;
	}
	return FOUND_COUNT;
    }
}

