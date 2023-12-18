import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      Long A = sc.nextLong();
      Long B = sc.nextLong();
      Long C = sc.nextLong();
      if(A == B && B == C && A == C){
        System.out.println("-1");
        return;
      }
      Long count = new Long(0);
      while(true){
        if(A % 2 == 1 || B % 2 == 1 || C % 2 == 1){
          System.out.println(count);
          return;
        }else{
          	Long tmpA = (B + C) / 2;
        	Long tmpB = (A + C) / 2;
        	Long tmpC = (A + B) / 2;
        	count++;
          A = tmpA;
          B = tmpB;
          C = tmpC;
        }
      }
	}
}
