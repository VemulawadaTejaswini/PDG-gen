import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int m = scan.nextInt();
			if(n == 0 && m == 0){
				break;
			}
			int[] d = new int[n+m];
			for(int i = 0;i < n+m;i++){
				d[i] = scan.nextInt();
			}
			Arrays.sort(d);
			int max = d[0];
			for(int i = 0;i < n+m-1;i++){
				if(max < d[i+1]-d[i]){
					max = d[i+1] - d[i];
				}
			}
			System.out.println(max);
		}
	}
}