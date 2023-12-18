import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();	
	  int b = sc.nextInt();
	  int k = sc.nextInt();
      int count = 0;      
      while(count < k){
        if(a>=1){
          a-=1;
          k-=1;
        }else if(b>=1){
          b-=1;
          k-=1;
        }else{
          k-=1;
        }        		
	}
}
