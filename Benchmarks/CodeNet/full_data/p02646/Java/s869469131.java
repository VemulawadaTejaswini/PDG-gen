import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int A = sc.nextInt();
        int V = sc.nextInt();
        int B = sc.nextInt();
        int W = sc.nextInt();
        int T = sc.nextInt();
      	boolean ans = false;
      	for(int i=0;i<=T;i++){
          if( A + V * i == B + W * i ){
            ans = true;
          }
        }
      	if( ans ){
          System.out.println("Yes"); 
        }else{
          System.out.println("No"); 
        }
      	   	
	}
}