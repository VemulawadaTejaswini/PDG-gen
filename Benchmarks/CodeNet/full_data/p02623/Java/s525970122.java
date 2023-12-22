import java.util.*;
class Main{
  public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int k=sc.nextInt();
	    LinkedList<Long> A=new LinkedList<>();
	    LinkedList<Long> B=new LinkedList<>();
	    
	    
	    for(int i=0;i<n;i++){
	A.add(sc.nextLong());
	    }for(int i=0;i<m;i++){
	B.add(sc.nextLong());
	    }
	   long temp=k;
	    
	    long sum=0;
	    long count=0;
	    boolean v1=true;
	    boolean v2=true;
	    while(sum<k){
	    	if(!A.isEmpty()&&A.peekFirst()<=temp) {
	sum+=A.peekFirst();
	temp=temp-A.pollFirst();
	    	v1=false;
	if(sum<=k) {
		count++;
	}
	    	}else {
	    		v1=true;
	    	}
	    	
	      if(sum<k){
	        if(!B.isEmpty()&&B.peekFirst()<=temp) {
	sum+=B.peekFirst();
	temp=temp-B.pollFirst();
	        v2=false;
	if(sum<=k) {
	count++;
	}
	        }
	        }else {
	        	v2=true;
	        }
	      if(v1==true&&v2==true) {
	    	  break;
	      }
	      
	}
	      
	    

	
	    System.out.println(count);
		 
	 

  }
}
   
  
