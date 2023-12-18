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
      if(A == Math.min(A,Math.min(B,C))){
        System.out.println((B > C) ? "Yes" : "No");
      }else if(B == Math.min(A,Math.min(B,C))){
        System.out.println((C > A) ? "Yes" : "No");
      }else{
        System.out.println((B > A) ? "Yes" : "No");
      }
	}
}
