import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int A=sc.nextInt();
      int B=sc.nextInt();
      int C=sc.nextInt();
      int cnt=0;
      if(A==B){
         cnt++;
      }
      if(A==C){
         cnt++;
      }
      if(B==C){
         cnt++;
      }
      if(cnt==1){
         System.out.print("Yes");
      }else{
         System.out.print("No");
      }
   }
}
