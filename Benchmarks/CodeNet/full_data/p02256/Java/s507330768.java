import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(gcd(x,y));
	}
	static int gcd(int a,int b){
		int t=0;
		while(true){
			if(b==0){
				break;
			}else{
				t=a%b;
				a=b;
				b=t;
				gcd(a,b);
			}
		}
		return a;
	}
}