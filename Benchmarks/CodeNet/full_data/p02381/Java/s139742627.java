import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		while(true){
			n=scan.nextInt();
			if(n==0)
				break;
			double sum = 0;
			int[] s = new int[n];
			for(int i=0;i<n;i++){
				s[i]=scan.nextInt();
				sum+=s[i];
			}
			sum/=n;
			double variance = 0;
			for(int i=0;i<n;i++){
				variance+=(s[i]-sum)*(s[i]-sum);
			}
			variance/=n;
			System.out.println(Math.sqrt(variance));
		}
		scan.close();
	}
}
