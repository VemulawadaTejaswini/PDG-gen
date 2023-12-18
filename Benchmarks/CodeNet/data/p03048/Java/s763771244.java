import java.util.*;
import java.math.*;
 import static java.util.stream.Collectors.toList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入

		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int maxR =n/r;
		int maxG =n/g;
		int maxB =n/b;
		
		int count =0;
		for(int i=0;i<=maxR;i++){
			for(int j=0;j<=maxG;j++){
				for(int k=0;k<=maxB;k++){
					int sum = r*i + g*j + b*k;
					if(n==sum){
						count++;
					}
				}
			}
		}
		System.out.println(count);
 
	}

}


