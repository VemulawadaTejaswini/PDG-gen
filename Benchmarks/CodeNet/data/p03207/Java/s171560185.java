import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner f = new Scanner(System.in);
		Scanner v = new Scanner(System.in);
		int N = sc.nextInt();
		int max = f.nextInt();
		int sum = max;
		int b;
		for(int i=0;i<N-1;i++) {
			b = v.nextInt();
			if(b>max) {
				max =b;
			}
			sum+=b;
		}
		max = max/2;
		sum = sum-max;
       System.out.println(sum);		
	}

}
