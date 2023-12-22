import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int total=sc.nextInt();
      int totalleg=sc.nextInt();
      if(totalleg>=2*total&&totalleg<=4*total&&totalleg%2==0){
         System.out.println("Yes");
      }else{
         System.out.println("No");
      }  
   }
}
      
      
