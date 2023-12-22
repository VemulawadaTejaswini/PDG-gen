import java.util.*;
 
class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
 	 long K = sc.nextInt();
 	 long R = -1;
	 long Ar = 7;
     long i=1;
    if(K%2!=0){
	 while(i<=K){
   	 	if(Ar%K == 0){
    	  R = i;
          i = K+1;
        }else{
    	  Ar+= 7*Math.pow(10,i);
          i++;
    	}
	  }
    }
  	  System.out.println(R);
  }
}