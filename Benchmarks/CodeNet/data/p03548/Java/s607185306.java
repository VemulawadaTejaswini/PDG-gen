import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s[]=br.readLine().split(" ");

        int x=Integer.parseInt(s[0]);
	int y=Integer.parseInt(s[1]);
	int z=Integer.parseInt(s[2]);

	int sum=z;
	int count=0;

	while(true){
	    sum+=y+z;
	    	count++;
	    if(sum==x){
		break;
	    }else if(sum>x){
		count--;
		break;
	    }
	}

	System.out.println(count);
	
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
