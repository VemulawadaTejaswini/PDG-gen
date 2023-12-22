import java.io.*;
import java.util.*;

public class Main {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
    private static StringTokenizer st;

    public static void main ( String [] args ) throws IOException
    {
	new Main().cal();
    }

 
    private void cal() throws IOException 
    {
	int N = Integer.parseInt(br.readLine());
	int [] nums = new int [N];

	st = new StringTokenizer(br.readLine());
	for(int i = 0; i < N; i++) 
	    nums[i] = Integer.parseInt(st.nextToken());

	int count = 0;
	for(int i = 0; i < N; i++) {
	    int mini = i;
	    for(int j = i; j < N; j++) {
		if ( nums[j] < nums[mini] )
		    mini = j;
	    }
	    if ( i != mini ) {
		swap(nums, i, mini);
		count++;
	    }
	}

	for(int i = 0; i < N; i++) {
	    if ( i > 0 ) System.out.print(" ");
	    System.out.print(nums[i]);
	}
	System.out.println("");
	
	System.out.println(count);
	

    }

    private void swap(int [] n, final int i, final int j){
	int temp = n[i];
	n[i] = n[j];
	n[j] = temp;
    }

}