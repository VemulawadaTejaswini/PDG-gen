import java.util.*;

public class Main{
//public class abc166_a{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		long[] a = new long[n];
		for(int i=0; i<n; i++){
			a[i] = scan.nextLong();
		}
		
		for(int i=0; i<n; i++){
			boolean flag = true;
			for(int j=0; j<n; j++){
				if(i != j){
					if(a[i] % a[j] == 0) flag =false;
				}
			}
			if(flag){
				System.out.println(i+1);
				break;
			}
			if((i+1) == n && !flag)System.out.println(0);
		}

	}

}