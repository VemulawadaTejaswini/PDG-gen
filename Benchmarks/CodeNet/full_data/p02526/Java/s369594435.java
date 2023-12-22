import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int y, t = sc.nextInt(), count=0;
	int[] x = new int[t];
	
	for(int i=0; i<t; i++)
	    x[i]=sc.nextInt();
	Arrays.sort(x);

	int p = sc.nextInt();
	for(int i=0; i<p; i++){
	    y=sc.nextInt();
	    for(int j=0; j<t; j++)
		if(y==x[j]){
		    count++;
		    break;
		}
	}
	System.out.println(count);
    }
}