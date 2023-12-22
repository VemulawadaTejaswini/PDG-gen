import java.util.*;
 
class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
 	 int K = sc.nextInt();
 	 int R = -1;
	  int Ar = 7;
    int i =1;
	  while(i<=K*100){
   	 if(Ar%K == 0){
    	  R = i;
          i = K+1;
  	  }else{
    	  Ar+= 7*Math.pow(10,i);
          i++;
    	}
        
	  }
    System.out.println(R);
  }
}