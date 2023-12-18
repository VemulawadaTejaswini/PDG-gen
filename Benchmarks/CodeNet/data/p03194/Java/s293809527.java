import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		long x = Long.parseLong(b);
		long ans = 1;
		if(a==1){
			System.out.println(b);
			return;
		}
		if(Math.pow(2,a)<=x){
		for(long i = 2; Math.pow(i,a)<=x; i++){
			double c = Math.pow(i,a);
			if(x%c==0){
				ans = Math.max(ans,i);
			}
		}
		}
			System.out.println(ans);
	}
}