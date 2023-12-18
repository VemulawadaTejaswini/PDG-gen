import java.util.*;

public class Main {
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int n = Integer.valueOf(N);
		int[] B= new int[n];
		for(int i=0;i<n;i++){
			String a = sc.nextLine();
			int b = Integer.valueOf(a);
			if(b>i){
				System.out.println(-1);
				break;
			}
				for (int ic = n;ic>b;ic--){
					B[ic] =B[ic-1];
				}
				B[b] = b;
		}
		for (int iz=0;iz<n;iz++){
			System.out.println(B[iz]);
		}


	}
}
