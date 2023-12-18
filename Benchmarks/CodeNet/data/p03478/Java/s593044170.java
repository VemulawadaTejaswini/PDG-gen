import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int use =0;
		int sum =0;
		for(int i=1;i<N;i++){
			for(int j=0;j<4;i++){
				int na=i;
				i=i/10;
				use=use+na%10;
			}
			if(use>A&&use<B){
				sum+=i;
			}
			use=0;
		}
		System.out.println(sum);
	}
}