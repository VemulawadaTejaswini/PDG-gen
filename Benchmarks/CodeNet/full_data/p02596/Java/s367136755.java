import java.util.*;
 
class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
 	 int K = sc.nextInt();
 	 int R = -1;
	  int Ar = 7;
	  for(int i = 1;i<=K;i++){
   	 if(Ar%K == 0){
    	  R = i;
  	  }else{
    	  Ar+= 7*Math.pow(10,i);
    	}
        
	  }
    System.out.println(R);
  }
}