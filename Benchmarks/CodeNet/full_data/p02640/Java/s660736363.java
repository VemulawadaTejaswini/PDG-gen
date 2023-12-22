import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
      int y = sc.nextInt();
      int count = 0;
      if(y%2==1){
          System.out.println("No");
      }else{    
        while(y>=4){
           y = y-4;
           count++;
        }
        while(y>=2){
           y = y-2;
           count++;
        }    
        if(x>count){
           System.out.println("Yes");
        }
      }
   }
}