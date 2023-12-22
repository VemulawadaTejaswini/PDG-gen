import java.util.*;
public class Main {

		
	    public static void main(String[] args) throws java.io.IOException{
	        Scanner scan = new Scanner(System.in);
	        while(true){
	        int n=scan.nextInt();
	        if(n==0)break;
	        int [] data = new int[n];
	        for(int i=0;i<n;i++)
	        	data[i]=scan.nextInt();
	        int tar = scan.nextInt();
	        int r=n-1;
	        int l= 0;
	        int count=0;
	        while(true){
	        	count++;
	        	if((r-l)==0)break;
	        	int pos = (r+l)/2;
	        	if(data[pos] == tar ){
	        		
	        		break;
	        	}
	        	else if(data[pos]>tar)r=pos;
	        	else l=pos+1;
	        }
	        System.out.println(count);
	        }
	      
	        }
	    }
	    