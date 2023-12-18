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
      if(A == B && B == C){
        System.out.println("-1");
        return;
      }else if(A % 2 == 1 || B % 2 == 1 || C % 2 == 1){
        System.out.println("0");
        return;
      }
      Long count = new Long(0);
      while(true){
        Long tmpA = B / 2 + C / 2;
        Long tmpB = A / 2 + C / 2;
        Long tmpC = A / 2 + B / 2;
        count++;
        if(tmpA % 2 == 1 || tmpB % 2 == 1 || tmpC % 2 == 1){
          System.out.println(count);
          return;
        }else{
          A = tmpA;
          B = tmpB;
          C = tmpC;
        }
      }
	}
}
