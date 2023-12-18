import java.util.*;

public class Main{
	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int sum =0;

		for(int i=1; i<=k; i++){
			for(int j=1; j<=k; j++){
				for(int l=1; l<=k; l++){
					sum += gcd(l , gcd(i,j));
				}
			}
		}
		System.out.println(sum);
		
	}
}