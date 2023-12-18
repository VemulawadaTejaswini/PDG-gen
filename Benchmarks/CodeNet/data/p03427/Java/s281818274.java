import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String b = String.valueOf(N);
		int a = 1;
		if(N/10 < 10){
			if(N%10 == 9){
				System.out.println(N/10 + N%10);
				return;
			}else if(N/10 >= 1){
				System.out.println(N/10 - 1 + 9);
				return;
			}else{
				System.out.println(N);
				return;
			}
		}else{
			for(int i = 1; i < b.length(); i++){
				a *= 10;
			}
			if(N%a == a - 1){
				System.out.println(9*(b.length() -1) + N/a);
				return;
			}else{
				System.out.println(9*(b.length() - 1) + N/a - 1);
				return;
			}
		}
	}
}