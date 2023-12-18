import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int A = sc.nextInt();
      int B = sc.nextInt();
      if(B % A == 0){
        System.out.println(A + B);
      }else{
        System.out.println(B - A);
      }
	}
}
