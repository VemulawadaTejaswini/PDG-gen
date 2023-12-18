import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
//------------------------------------------------------------
		int n=sc.nextInt();
		int x=sc.nextInt();
		Integer[] candies = new Integer[n];
		for (int i=0;i<n;i++) {
			candies[i] =sc.nextInt();
		}
		Arrays.sort(candies);
		int wantedCandy =0;
		int happyChild =0;
		for (int i=0;i<n;i++) {
			wantedCandy += candies[i];
		}
		if (wantedCandy==x) {
			happyChild =n;
		} else if(wantedCandy<x) {
			happyChild = n-1;
		} else {
			for (int i=0;i<n;i++) {
				if(x-candies[i]>=0) {
					x -=candies[i];
					happyChild ++;
				}
			}
		}
		System.out.println(happyChild);
//------------------------------------------------------------
	}
}