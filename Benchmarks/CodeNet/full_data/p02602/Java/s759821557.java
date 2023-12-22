import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int[] a = new int[n];
		Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
		int[] p = new int[n-k+1];
		Arrays.setAll(p, i -> 1);
		for(int i=0; i<n-k+1; i++){
			for(int j=0; j<k; j++){
				p[i] *= a[i+j];
			}
			if(i != 0){
				System.out.println(p[i] > p[i-1] ? "Yes" : "No");
			}
		}
	}
}
