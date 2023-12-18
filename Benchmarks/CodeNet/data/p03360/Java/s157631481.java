import java.util.Scanner;
 
public class Main {
 
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int K = sc.nextInt();
			int x = 0;
			if(1 <=A && A <= 50 && 1 <= B && B <= 50 && 1 <= C && C <= 50 && 1 <= K && K <= 10)
			if(A >= B) {x = A;}
		    else {x = B;}
			if(C >= x) {x = C;
			x = x * 2 * K + A + B;}
            if(x == A) {x = x * 2 * K + B + C;}
            if(x == B) {x = x * 2 * K + A + C;}
			System.out.println(x);
			}}