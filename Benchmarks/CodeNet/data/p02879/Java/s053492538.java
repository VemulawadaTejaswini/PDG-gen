import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
      	int A = scn.nextInt();
      int B = scn.nextInt();
      if(A <= 9 && A >= 0 && B <= 9 && B >= 0){
      	System.out.println(A*B);
      }
      else{
        System.out.println(-1);
      }
			
		}
	}