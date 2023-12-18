import java.util.*;
public class Main{
	public static void main(String[] args){
		long ans_1 = 0;
		float ans_1_flo = 0;
		int ans_2 = 0;
		Scanner sc = new Scanner(System.in);
		long w = sc.nextInt();
		long h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		ans_1 = w * h / 2;
		ans_1_flo = w * h / 2;
		if((float)(w) / 2 == x && (float)(h) / 2 == y){
			ans_2 = 1;
		}else{
			ans_2 = 0;
		}
		
		if(w * h > 100000000){
			System.out.print(ans_1);
		}else{
			System.out.print(ans_1_flo);
		}
		System.out.print(" ");
		System.out.println(ans_2);
	}
}
