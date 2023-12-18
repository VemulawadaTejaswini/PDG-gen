import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int a = 0;
		if(sum%10 == 0){
			a = 10;
		}else{
			a = sum/10 + sum%10;
		}
		System.out.println(a);
		sc.close();
	}
}