import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String input = sc.next();
		int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      	
      if(tmp % 7 == 0 || tmp % 4 == 0){
        System.out.println("Yes");
        return;
      }else if(tmp <= 3){
        System.out.println("No");
      return;
      }
      
      int fourOnly = tmp;
      while(fourOnly > 0){
        fourOnly = fourOnly - 4;
          if(fourOnly % 7 == 0){
            System.out.println("Yes");
            return;
          }
        }
      
      int fourSeven = tmp;      
      while(fourSeven > 0){
          if(fourSeven % 4 == 0){
            System.out.println("Yes");
            return;
          }
        fourSeven = fourSeven - 7;
        }
      System.out.println("No");
      return;
	}
}
