import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		boolean flag = false;
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			if(flag){
				System.out.println();
			}
			flag = true;
			String[] country = new String[n];
			int[] point = new int[n];
			int[] copy = new int[n];
			for(int i=0;i<n;i++){
				country[i] = stdIn.next();
				point[i] += stdIn.nextInt()*3;
				stdIn.nextInt();
				point[i] += stdIn.nextInt();
				copy[i] = point[i];
			}
			Arrays.sort(copy);
			int cnt = 0;
			for(int i=0;i<n;i+=cnt){
				cnt = 0;
				for(int j=0;j<n;j++){
					if(copy[n-i-1]==point[j]){
						System.out.println(country[j]+","+point[j]);
						cnt++;
					}
				}
			}
		}
	}
}