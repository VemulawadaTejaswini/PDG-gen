import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int n = scan.nextInt();
		int maxv = (int) 1E-9;
		int minv =  (int) -(1E-9);
		
		for(int i = 0; i < n; i++){
			int r = scan.nextInt();
			if(i == 0){
				minv = n;
			}else{
				maxv = Math.max(maxv, r - minv);
				minv = Math.min(minv, r);
			}
		}
		System.out.printf("%d\n", maxv);
	}
}