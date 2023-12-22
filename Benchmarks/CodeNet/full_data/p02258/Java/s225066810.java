import java.util.*;

public class Main {

	static void cal(int n, int[] R){
	
		int max = R[1] - R[0];
		int x;
		int minr = R[0];
		
		for(int i = 1; i < n; i++){
			x = R[i] - minr;
			if(max < x) max = x;
			if(minr > R[i]) minr = R[i];
		}
		System.out.println(max);
	}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
		int[] R = new int[n];
		
		for(int i = 0; i < n; i++) R[i] = sc.nextInt();
		
		cal(n, R);
	}
}
