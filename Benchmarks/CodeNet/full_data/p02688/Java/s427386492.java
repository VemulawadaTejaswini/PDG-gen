import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] ar = new int[N];
		
		for(int i=0; i < K; i++){
			int a =  scan.nextInt();
			for(int j =0; j<a; j++){
				ar[scan.nextInt() - 1]++;
			}
		}

		int con =0 ;
		for(int x :ar){
			if(x == 0) con++;
		}
		System.out.println(con);

	}

}