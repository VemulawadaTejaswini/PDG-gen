import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
		int[] p = new int [N];
		int P = 0;
		int sum = 0;
		for (int i = 0; i < N; i++){
		    p[i] = sc.nextInt();
		    if (p[i] > P){
		        sum += p[i]/2 + P/2;
		        P = p[i];
		    }else{
		        sum += p[i];
		    } 
		}
		System.out.println(sum);
	}
}


