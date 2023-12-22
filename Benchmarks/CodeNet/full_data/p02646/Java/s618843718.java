import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = null;
      sc = new Scanner(System.in);
      int A = sc.nextInt();
      int V = sc.nextInt();
      int B = sc.nextInt();
      int W = sc.nextInt();
      int T = sc.nextInt();
      boolean flag = false;
      int A0 = A;
      int B0 = B;
      
      for(int i=1; i <= T; i++){
        if(A <= B){
        	A = A+V;
        	B = B+W;
        }else{
            A = A-V;
        	B = B-W;
        }
        
        if(A == B){
          flag = true;
          break;
        }
      }
      
      if(A0 == B0){
        flag = true;
      }
      if(flag){
         System.out.println("YES");
      }else{
         System.out.println("NO");
      }
    }
}