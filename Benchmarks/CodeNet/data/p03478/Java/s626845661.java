import java.util.*;
public class Main{
	static int SomeSums(int k, int p, int q){
		int sum = 0;
		for(int i=1; i<=k; i++){
			String is = String.valueOf(i);
			int d = 0;
			for(int j=0; j<is.length(); j++){
				d += Character.getNumericValue(is.charAt(j));
			}
			if(p<=d && d<=q)sum+=i;
		}
		return sum;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(SomeSums(n, a, b));
	}
}