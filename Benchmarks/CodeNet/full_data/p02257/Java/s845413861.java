import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
		  int n,i,j,b,count,kekka=0;
	    Scanner sc=new Scanner(System.in);
	    n=Integer.parseInt(sc.next());
	    
	    int a[]=new int[n+1];
	    for(i=0;i<n;i++){
	    	a[i]=Integer.parseInt(sc.next());
	    
	    }
	    for(i=0;i<n;i++){
	    	count=0;
	    	
	    	for(j=2;j<=a[i];j++){
	    		if(a[i]%j==0){
	    			count++;
	    		}
	    		
	    	}
	    	
	    	if(count==1){
	    		kekka++;
	    		
	    	}
	    }
	    System.out.print(kekka);
	  }
	  }