import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long x = Long.parseLong(sc.next());
		long k = Long.parseLong(sc.next());
		long d = Long.parseLong(sc.next());
		long[] temp = new long[10000];
		for(int i=0; i<k; i++){
			long plus = x + d;
			long minus = x - d;
			if(Math.abs(plus) < Math.abs(minus)){
				x = plus;
			}else{
				x = minus;
			}
			temp[i] = x;
			if(i > 2 && temp[i-2] == x){
				if(k % 2 != i % 2){
					x = temp[i-2];
				}
				break;
			}
		}
		System.out.println(Math.abs(x));
	}
}
