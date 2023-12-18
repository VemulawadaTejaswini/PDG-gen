import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = 0;
		int count = 1;
		if(x <= 6){
		System.out.println(count);
		}
		if(x > 6){
			count = 2*(x/11);
			x = x - (11*(x/11));
//			System.out.println(x);
			if(x <= 6){
				System.out.println(count+1);
			}else{
				System.out.println(count+2);
			}
		}
	}
}