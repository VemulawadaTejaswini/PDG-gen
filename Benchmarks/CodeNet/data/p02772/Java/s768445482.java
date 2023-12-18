import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	boolean can = true;
    	for(int i=0;i<n;i++) {
    		int m =sc.nextInt();
    		if(m%2==0) {
    			if(m%3!=0&&m%5!=0) {
    				can = false;
    			}
    		}
    	}
    	String s = can?"APPROVED":"DENIED";
    	System.out.println(s);
	}
}