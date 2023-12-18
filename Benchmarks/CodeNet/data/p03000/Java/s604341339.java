import java.util.*;
public class Main {
	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[] l = new int[n];
		
		for(int i=0;i<n;i++) {
			l[i] = sc.nextInt();
		}
		
		int d = 0;
		int cnt = 1;
		for(int i=0;i<n;i++) {
			d = d + l[i];
			if(d > x) {
				break;
			}
			cnt++;
		}
		
		System.out.println(cnt);
		
	}
	


}