import java.util.*;

class Main{
  	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int V = sc.nextInt();
      int B = sc.nextInt();
      int W = sc.nextInt();
      int T = sc.nextInt();
      boolean flag = true;
      if(A>B){
        flag = false;
      }
      for(int i=0;i<T;i++){
        if(flag){
        	A += V;
        	B +=W;
        }else{
          A	-= V;
          B -= W;
        }
      }
      if(flag){
        if(A>=B){
          System.out.print("YES");
        }else{
          System.out.print("NO");
        }
      }else{
        if(A<=B){
          System.out.print("YES");
        }else{
          System.out.print("NO");
        }
      }
      
    }
}