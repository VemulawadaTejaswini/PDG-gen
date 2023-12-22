import java.util.*;
class Main{
  public static void main(String[] args){
Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int sum=0;
		    Map<Integer,Integer> m=new HashMap<>();
		    for(int i=0;i<n;i++){
		    		int c=sc.nextInt();
		    		sum+=c;
		    		if(!m.containsKey(c)) {
		    			m.put(c,1);
		    		}else {
		    			m.put(c,m.get(c)+1);
		    		}
		    }int k=sc.nextInt();
		    for(int i=0;i<k;i++) {
		    	 int prev=sc.nextInt();
				    int fill=sc.nextInt();
				    if(m.containsKey(prev)) {
				    int g=m.get(prev);
				    sum=sum-prev*g;
				    sum=sum+fill*g;
				  				    m.remove(prev);
				    
				    if(!m.containsKey(fill)) {
		    			m.put(fill,g);
		    		}else {
		    			m.put(fill,m.get(fill)+1);
		    		}
				    
				    }else {
				    	m.put(prev, 1);
				    }
				    System.out.println(sum);
		    }
		    
		   
		 

  }
    
  }
