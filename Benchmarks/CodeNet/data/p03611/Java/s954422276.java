import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] Nmap = new int[100000];
		for (int i = 0; i < N; i++) {
			Nmap[sc.nextInt()]++;
		}
		int max = 0;
		for (int i = 0; i < 100000-2; i++) {
			int sum = Nmap[i] + Nmap[i+1] + Nmap[i+2];
			if (max < sum) {
				max = sum;
			}
		}
		System.out.println(max);
	}
}