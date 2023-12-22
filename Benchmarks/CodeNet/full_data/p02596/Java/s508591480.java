import java.util.*;
 
class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
 	 int K = sc.nextInt();
 	 int R = -1;
	 int Ar = 7;
     int i=1;
    if(K%2!=0){
	 while(i<=K){
   	 	if(Ar%K == 0){
    	  R = i;
          i = K+1;
        }else{
    	  Ar =Ar*10+7;
          i++;
    	}
	  }
    }
  	  System.out.println(R);
  }
}