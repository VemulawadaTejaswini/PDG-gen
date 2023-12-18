import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s[]=br.readLine().split(" ");

        int n=Integer.parseInt(s[0]);
	s=br.readLine().split(" ");

	long min=600000000;
	int card[]=new int[n];

	for(int i=0;i<n;i++){
	    card[i]=Integer.parseInt(s[i]);    
	}

	for(int i=1;i<=n-1;i++){
	    int front=0;
	    int back=0;
	    for(int j=0;j<i;j++){
		front+=card[j];
	    }
	    for(int j=n-1;j>=i;j--){
		back+=card[j];
	    }
	    if(front>back)
		min=Math.min(min,Math.abs(front-back));
	    else
		min=Math.min(min,Math.abs(back-front));
	}

	System.out.println(min);

     
	
    }
    public static void permutation(String q, String ans){
        // Base Case
        if(q.length() <= 1) {
	    //   comb.add(ans + q);
        }
        // General Case
        else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1),
                        ans + q.charAt(i));
            }
        }
    }
}
