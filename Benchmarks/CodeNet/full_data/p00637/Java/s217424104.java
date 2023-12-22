import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int[] page = new int[n];
			for(int i = 0;i < n;i++){
				page[i] = scan.nextInt();
			}
			Arrays.sort(page);
			int[] dif = new int[n-1];
			for(int i = 0;i < n-1;i++){
				dif[i] = page[i+1] - page[i];
			}
			String ans = String.valueOf(page[0]) + "-";
			for(int i = 0;i < n-1;i++){
				if(dif[i] < 2){
					continue;
				}
				ans += page[i] + " " + page[i+1] + "-";
			}
			ans += page[n-1];
			System.out.println(ans);
		}
	}
}