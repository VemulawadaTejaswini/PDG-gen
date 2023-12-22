import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] R = new int[n];
		
		for(int i=0;i<n;i++){
			R[i] = Integer.parseInt(sc.next());
		}
		
		int max=R[1]-R[0];
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				int d = R[j]-R[i];
				if(max<d) max=d; 
			}
		}
		System.out.println(max);

	}

}