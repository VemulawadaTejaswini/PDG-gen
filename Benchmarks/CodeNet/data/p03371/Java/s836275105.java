import java.util.*;
public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int price = 0;
		
		if((A + B) > (C * 2)){
			if(X > Y){
				price += C * Y * 2;
				X -= Y;
				price += X * A;
			}else{
				price += C * X * 2;
				Y -= Y;
				price += Y * B;
			}
		}else{
			price = X * A + Y * B;
		}

		System.out.println(price);
	}
}
