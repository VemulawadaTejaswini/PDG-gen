import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      int touSa = b - a;
      int aTou = 0;
      for(int i = touSa - 1; i != 0; i--){
        aTou += i;
      }
      System.out.println(aTou - a);
      
	}
}
