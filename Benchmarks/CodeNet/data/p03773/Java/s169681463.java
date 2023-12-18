import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = n;
		for(int i = 1; i <= n ; i++){
		int a = 0;
		int b = 0;
			if(n%i==0){
				a = n/i;
				b = n/a;
				if(a >= b && min >= Integer.toString(a).length()){
					min = Integer.toString(a).length();
				}else if(min >= Integer.toString(b).length()){
					min = Integer.toString(b).length();
				}
			}
		}
		System.out.println(min);
}
}