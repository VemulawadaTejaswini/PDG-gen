import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	int[] x=new int[3];
    	for(int i=0;i<3;i++)
    		x[i] = sc.nextInt();
    	
    	Arrays.sort(x);
    	
    	int sum = 0;
    	for(int i=0;i<2;i++) {
    		if(x[i]==x[i+1])
    			sum++;
    	}
    	String s = sum==1?"YES":"NO";
    	System.out.println(s);
	}
}