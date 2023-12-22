import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int x = Integer.parseInt(sc.next());
      	int k = Integer.parseInt(sc.next());
      	int d = Integer.parseInt(sc.next());
 
      
      	for(int i = 0;i<k;i++){
          if(x>0){
 	         x = x-d;
          }else{
            x = x + d;
          }
        }
          System.out.println(Math.abs(x));
    
      }
}

