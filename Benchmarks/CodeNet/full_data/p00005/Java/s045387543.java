import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int a = in.nextInt();
			int b = in.nextInt();
			int k = 2;
			int lcm = 1;
			System.out.println(a+" "+b+" "+lcm);
			while(k < a || k < b){
				while(a%k == 0 && b%k == 0){
					a = a/k;
					b = b/k;
					lcm = lcm*k;
				}
				k++;
			}
			System.out.println(lcm+" "+(lcm*a*b));
		}
	}
}