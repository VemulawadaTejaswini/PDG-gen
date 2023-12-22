import java.util.*;
class Main{
  public static void main(String[] args){
Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    long sum=0;
		    Map<Long,Long> m=new HashMap<>();
		    for(int i=0;i<n;i++){
		    		long c=sc.nextLong();
		    		sum+=c;
		    		if(!m.containsKey(c)) {
		    			m.put(c,1);
		    		}else {
		    			m.put(c,m.get(c)+1);
		    		}
		    }int k=sc.nextInt();
		    for(int i=0;i<k;i++) {
		    	 long prev=sc.nextLong();
				    long fill=sc.nextLong();
				    if(m.containsKey(prev)) {
				    long g=m.get(prev);
				    sum=sum-prev*g;
				    sum=sum+fill*g;
				  				    m.remove(prev);
				    
				    if(!m.containsKey(fill)) {
		    			m.put(fill,g);
		    		}else {
		    			m.put(fill,m.get(fill)+g);
		    		}
				    
                    }
				    System.out.println(sum);
		    }
		    
		   
		 

  }
    
  }
