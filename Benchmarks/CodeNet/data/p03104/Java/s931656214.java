import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
		long b = sc.nextLong();
		long ans=0;
		if(a==b){
			System.out.println(a);
			return;
		}
		if(a%2==1){
			ans=a;
			a++;
		}
		if(b%2==0){
			ans^=b;
			b--;
		}
		if((((b-a+1)/2)%2)==1){
			ans^=1;
		}
		System.out.println(ans);
	}
}