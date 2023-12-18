import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int result ;
		if (A<10 && B<10){
			result = A*B;
		}else if(A>10 && B<10){
			result = -1;

		}else if(A<10 && B>10){
			result = -1;
		}else{
			result = A*B;
		}
		System.out.println(result);
	}
}