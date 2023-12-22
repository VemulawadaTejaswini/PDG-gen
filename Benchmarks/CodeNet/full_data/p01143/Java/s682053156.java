import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int m = scan.nextInt();
			double p = scan.nextDouble();
			if(n == 0 && m == 0 && p == 0){
				break;
			}
			double sum = 0;
			int a = 0;
			p /= 100;
			m--;
			for(int i = 0;i < n;i++){
				int t = scan.nextInt();
				sum += t * 100;
				if(i == m){
					a = t;
				}
			}
			System.out.println((a==0)?0:(int)(sum*(1.0-p))/a);
		}
	}
}