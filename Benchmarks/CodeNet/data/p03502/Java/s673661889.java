import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = n;
		int r = 0;
		int sum = 0;
		while(q!=0){
			r = q%10;
			q = q/10;
			sum += r;
		}
		if(n%sum==0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}