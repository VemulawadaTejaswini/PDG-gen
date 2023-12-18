import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int Y = sc.nextInt();
        
        loop: for(int x=0; x<=N; x++){
          for(int y=0; y<=N-x; y++){
            int z = N-x-y;
            if(10000*x+5000*y+1000*z==Y){
              System.out.println(x + " " + y + " " + z);
              break loop;
            }
          }
          if(x==N){
            System.out.println("-1 -1 -1");
          }
        }
            
    }
}