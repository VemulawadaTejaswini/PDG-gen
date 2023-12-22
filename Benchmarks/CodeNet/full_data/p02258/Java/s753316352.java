import java.util.*;
public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt(); 
		int Rt [] = new int[n];
        for(int i = 0; i < n; i++) {
			Rt[i] = sc.nextInt();
		}
		int Rmax = Integer.MIN_VALUE;
        int Rmin = Rt[0];
		
		for(int j = 1; j < n; j++) {
			Rmax = Math.max(Rmax, Rt[j] - Rmin);
			Rmin = Math.min(Rmin, Rt[j]);
		}
		System.out.println(Rmax);
	}
}