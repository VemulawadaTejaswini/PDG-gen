import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        long l=sc.nextLong();
        long r=sc.nextLong();
		long min=0;
    
 	if((r-l)>=2018){
    		System.out.println(0);
    	}else if((r-l)<(2019-l%2019)){
     		for(long e=l;e<r;e++){
              for(long f=e+1;f<=r;f++){
            	min=Math.min(min,e*f%2019);
              }
            }
      	System.out.println(min);
   	 }else{

    	System.out.println(0);
    }
    }
}
