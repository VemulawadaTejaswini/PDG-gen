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
    Collections.sort(A);
    Collections.sort(B);
	    long sum=0;
	    long count=0;
	    while(k!=0&&sum<=k){
	    	if(!A.isEmpty()) {
	sum+=A.pollFirst();
            
	if(sum<=k) {
		count++;
	}
	    	}
	      if(sum<k){
	        if(!B.isEmpty()){
	sum+=B.pollFirst();
            }
	if(sum<=k) {
		count++;
	}
	      }else {
break;
	      
	    }
        }
	    System.out.println(count);

  }
}
   
  
