import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
		int cnt=Math.abs(A-B)/2;
		if(Math.abs(A-B)%2==1){
			cnt=cnt+1;
			C=C+1;
		}
		int big=A;
		if(big<B)big=B;
		if(C>big){
			cnt=cnt+C-big;
		}else{
			cnt=cnt+(big-C)/2;
			if((big-C==1)){
				cnt=cnt+2;
			}
		}
		System.out.println(cnt);
	}
}
