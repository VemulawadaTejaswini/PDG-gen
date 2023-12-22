import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			int m = in.nextInt();
			int p = in.nextInt();
			if(n == 0) break;
			int sum = 0;
			for(int i=0; i<n; i++){
				int x = in.nextInt();
				sum += x;
				if(i+1==m) m = x;
			}
			double res = m==0?0:((double) sum*(100.0-p))/m;
			System.out.println((int)res);
		}
	}
}