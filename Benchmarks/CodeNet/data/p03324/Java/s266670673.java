
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int D=sc.nextInt();
		int N=sc.nextInt();
		if(D!=0) {
			for(int i=0; i<D; i++) {
				N*=100;
			}
		}
		System.out.println(N);
	}

}
