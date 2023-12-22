import static java.lang.Math.*;

import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
		  int n,i,b,count,kekka=0,j,c;
		  double d;
		 
	    Scanner sc=new Scanner(System.in);
	    n=Integer.parseInt(sc.next());
	    
	    int a[]=new int[n+1];
	    for(i=0;i<n;i++){
	    	a[i]=Integer.parseInt(sc.next());
	    	
	    }
	    
	    for(i=0;i<n;i++){
	    	count=0;
	    	
	    	
    	d=sqrt(a[i]);
    	
    	if((int)d<d){
    		 c=(int)d+1;
    	}
    	else{
    		 c=(int)d;
    	}
    	System.out.print("c=");
    	System.out.println(c);
	    	for(j=2;j<=c;j++){
	    		if(a[i]==2){
	    			kekka++;
	    			System.out.println("2!");
	    			break;
	    		}
	    		
	    		if(a[i]%j==0){
	    			count++;
	    			System.out.println("count ");
	    			System.out.println(j);
	    			System.out.println(count);
	    		}
	    		
	    		if(count==1){
	    			System.out.print("break ");
	    			System.out.println(a[i]);
	    			break;
	    		}
	    		if(j==c){
		    		kekka++;
		    		System.out.println("sosuu ");
		    		System.out.println(a[i]);
		    	}
	    	}
	    	
	    	
	    }
	    System.out.println(kekka);
	  }
	  }