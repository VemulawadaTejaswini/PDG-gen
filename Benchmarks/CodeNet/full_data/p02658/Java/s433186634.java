import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		
		if(2<=t && t<=Math.pow(10,5)){
    	    int sum=1;
		    int[] a = new int[t];
		    for(int i=0;i<t;i++){
    		    a[i]=sc.nextInt();
    		}	    
    		for(int i=0;i<t;i++){
    		    sum=sum*a[i];
    		}
    		if(0<=sum && sum <= Math.pow(10,18)){
    		    System.out.println(sum);
    		}else{
    		    System.out.println("-1");
    		}
		}
	}
}