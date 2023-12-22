import java.util.*;
 
class Main {
    
	static int res=0,d,w,E[][]=new int[10][10];
	
    public static void main(String[] args) {
         
       Scanner cin=new Scanner(System.in);
       
       while(true) {
    	   int n=cin.nextInt();
    	   
    	   if(n==0)break;
    	   else if(n==1) {
    		   System.out.println(1);
    		   continue;
    	   }
    	   
    	   int res=0;
    	   List<Integer> A=new ArrayList<>();
    	   A.add(2);
    	   for(int i=3;i<=2*n;i++) {
    		   boolean jd=true;
    		   for(int j=0;j<A.size();j++) {
    			   if(i%A.get(j)==0) {
    				   jd=false;
    				   break;
    			   }
    		   }
    		   
    		   if(jd) {
    			   A.add(i);
    			   if(i>n)res++;
    		   }
    		   
    	   }
    	   
    	   System.out.println(res);
       }
    }
}
