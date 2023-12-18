import java.util.*;
public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); //月
		int B = sc.nextInt(); //日
		if(A > B)
			A -= 1;
		
		System.out.println(A);
	}
}
