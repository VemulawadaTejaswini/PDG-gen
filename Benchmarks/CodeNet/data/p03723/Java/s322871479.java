import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      if(A == B && B == C && A == C){
        System.out.println("-1");
        return;
      }
      int count = 0;
      while(count <= 100){
        if(A % 2 == 1 || B % 2 == 1 || C % 2 == 1){
          System.out.println(count);
          return;
        }else{
          	int tmpA = (B + C) / 2;
        	int tmpB = (A + C) / 2;
        	int tmpC = (A + B) / 2;
        	count++;
            A = tmpA;
            B = tmpB;
            C = tmpC;
        }
      }
      if(count > 100){
        System.out.println("-1");
      }
	}
}
