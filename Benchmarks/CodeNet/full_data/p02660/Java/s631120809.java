import java.util.*;
public class Main{
  public static void main(String[] args){
  	Scanner sc=new Scanner(System.in);
    long N=sc.nextLong();
    long originalN=N;
    int half=(int)Math.sqrt(N)+1;
    int turn=0;
    	for(int i=2;i<=half;i++){
      		if(N%i==0){
        		N=N/i;
                turn++;
            }
          if(N==1) break;
    	}
    
    if(originalN==N&&N!=1) turn=1;
    
    System.out.println(turn);
  }
}