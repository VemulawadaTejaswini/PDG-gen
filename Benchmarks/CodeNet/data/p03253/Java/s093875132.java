

import java.util.*;

class Main{
	
	public static void main (String args[]){
	Scanner sc= new Scanner(System.in);
	
	long N = sc.nextLong();
	long M = sc.nextLong();
	
	sc.close();
	
	long first = M;
	
	long count =0;
	
	//long fac = 0;
	
	long div = 1;
	
	long ans = 1;
	
	//ArrayList <Long> array = new ArrayList<>();
    //array.add((long)1);
    
    for(long i=2; i<=M;i++){
        if(i==M && M==first)break;
        if(M%i == 0){
          count=0;
          while (M%i==0){
            count++;
            M=M/i;
          }
          
          //System.out.println(count);
          ans = (ans*fac(count,N))%1000000007;
          
          count = 0;
          //System.out.println;
        }
     }
    
   
   System.out.println(ans);
    }
    
    public static long fac(long count,long N){
      if(count==1)return N;
      long k =factorial(count+N-1,N);
      long l =factorial(count, (long)1);
      //System.out.println(k +" "+l + " "+k/l%1000000007+" "+k/l);
      return (k/l)%1000000007;
      }
	
	
	public static long factorial (long num, long dest){
		if(num==dest){return dest;
		}else{
		return (num*factorial(num-1,dest));
		}
	}
	
	
}
