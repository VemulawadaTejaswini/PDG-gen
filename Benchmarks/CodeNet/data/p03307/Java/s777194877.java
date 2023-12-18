

import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
		 int res = 0;
 		
if(N %2 ==0){
res = N;
} else {
res = N*2;
}

System.out.println(res);
}
}