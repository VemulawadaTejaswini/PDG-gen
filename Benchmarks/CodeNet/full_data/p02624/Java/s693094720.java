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
	    A.addAll(B);
	    Collections.sort(A);
	    int sum=0;
	    int count=0;
	   for(int i=0;i<A.size();i++) {
		   sum+=A.get(i);
		   if(sum<=k) {
			   count++;
		   }else {
			   break;
		   }
	   }
	   System.out.println(count);
	    
	    
	 

  }
}
   
  
