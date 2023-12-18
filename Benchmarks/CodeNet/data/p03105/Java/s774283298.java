import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int x = 0,y=B;
		if(A<=0||A>=100 && B<=0||B>=100 && C<=0||C>=100) {
	for(x=1;x<C;x++) {
		if(y<=A)break;
		y=y-A;
	}
	System.out.println(x);
		}
	}
}