import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		while(true){
			int sum=0;
			int ave=0;
			int n=scan.nextInt();
			if(n==0){
				break;
			}
			int[] s = new int[n];
			for(int i = 0;i < n;i++){
				s[i]=scan.nextInt();
			}
			Arrays.sort(s);
			for(int i=1;i<n-1;i++){
				sum+=s[i];
			}
			ave=sum/(n-2);
			System.out.println(ave);
		}
	}
}

