
    import java.util.*;
    public class Main {
    	public static void main(String[] args){
    	int[] a=new int[200000];
    		Scanner sc = new Scanner(System.in);  		
    		  int b = Integer.parseInt(sc.next());
    		  int c = Integer.parseInt(sc.next());
    		  long count=0;
    		  int max=0;
    		  int num=0;
    		  int i;
    	   for(i=0;i<b;i++){
              a[i]=sc.nextInt();
             }
    
    	       while(c>0){
    	       for(i=0;i<b;i++){
    	         if(a[i]<max){
    	         }else{
    	         max=a[i];
    	         num=i;
    	         }
    	         
    	         }
    	         a[num]=0;
    	         max=0;
    	        c--;
    	       
    	       }
    	       
    	       for(i=0;i<b;i++){
              count+=a[i];
             }
    	  
    	       
    	       System.out.println(count);
    		
    	}
    }