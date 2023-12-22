import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	long x = Long.parseLong(sc.next());
      	long k = Long.parseLong(sc.next());
      	long d = Long.parseLong(sc.next());
 
      /*
      	for(int i = 0;i<k;i++){
          if(x>0){
 	         x = x-d;
          }else{
            x = x + d;
          }
        }
          System.out.println(Math.abs(x));
    */
      
      if(x-d != 0){
        System.out.println(x-d);
      }else{
        System.out.println(x);
      }
      }
}

