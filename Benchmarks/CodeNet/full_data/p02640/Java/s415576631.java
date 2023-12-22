import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
      int y = sc.nextInt();
      int count = 0;
      boolean hit = false;
      for(int i = 0;i<=x;i++){
         if(4*(x-i)+2*i==y){
             hit = true;
         }
      }
      if(hit){
         System.out.println("Yes");
      }else{
         System.out.println("No");
      }
   }
}