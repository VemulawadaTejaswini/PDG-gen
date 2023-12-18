import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long min = n;
		for(long i = 1; i <= n ; i++){
		long a = 0;
		long b = 0;
			if(n%i==0){
				a = n/i;
				b = n/a;
				if(a >= b && min >= Long.toString(a).length()){
					min = Long.toString(a).length();
				}else if(min >= Long.toString(b).length()){
					min = Long.toString(b).length();
				}
			}
		}
		System.out.println(min);
}
}