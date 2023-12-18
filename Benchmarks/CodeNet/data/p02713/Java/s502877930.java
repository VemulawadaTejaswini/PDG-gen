import java.util.*;
public class Main {

	public static int gcd(int a,int b) {
		
		if(a<b) return gcd(b,a);
		if(b==0) return a;
		
		return gcd(b,a%b);
	}
	
	public static int gcd2(int a,int c) {
		if(a<c) return gcd2(c,a);
		if(c==0) return a;
		
		return gcd2(c,a%c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int K = cin.nextInt();
		
		int sum = 0;
		int a = 0;;
		for(int i = 0;i<K;i++)
			for(int j = 0;j<K;j++) {
				a = gcd(i+1,j+1);
				for(int n= 0;n<K;n++) {
					sum+=gcd(a,n+1);
				}
			}
		System.out.println(sum);

	}

}