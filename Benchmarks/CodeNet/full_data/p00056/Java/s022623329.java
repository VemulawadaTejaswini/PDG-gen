import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    boolean[] prime = new boolean[50000];
	    Arrays.fill(prime, true);
	    prime[1]=prime[0]=false;
	    for(int i=2; i<Math.sqrt(50000); i++)
		if(prime[i]){
		    for(int j=i*i; j<50000; j+=i)
			prime[j]=false;
		}
	    ArrayList<Integer> pr = new ArrayList<Integer>();	    
	    for(int i=2; i<50000; i++)
		if(prime[i])
		    pr.add(i);
	    
	    int[] nx = new int[50001];
	    for(int i=0; i<pr.size(); i++)
		for(int j=i; j<pr.size() && pr.get(i)+pr.get(j)<=50000; j++)
		    nx[pr.get(i)+pr.get(j)]++;
	    
	    int n;
	    while((n = Integer.valueOf(sc.readLine()))!=0)
		System.out.println(nx[n]);
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}