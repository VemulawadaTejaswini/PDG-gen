import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
      	long b=sc.nextLong();
      	ArrayList<Long> al=new ArrayList<Long>();
     for(long i=1;i<=Math.min(a,b);i++){
     	if((a%i==0)&&(b%i==0)){
        	al.add(i);
        }
     }
      int c=0;
      for(long e:al){
      if(Prime(e)){c++;}
        }
      
      System.out.println(c);
        
    }
  
      public static boolean Prime(long n){
      		if(n==1){
           		return true;
            }else if(n==2){
              return true;
            }else{
            	for(long d=2;d<n;d++){
                    if(n%d==0){return false;}
                }
              return true;
            }
      }
}
