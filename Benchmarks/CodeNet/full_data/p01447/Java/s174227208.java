import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int count = 0;
			int a = 0;
			int b = 0;
			while(true){
				if(n < 2){
					break;
				}else if(n <= 3){
					count++;
					break;
				}
				a = (int)(0.5 + ((double)n/3.0));
				b = n - (2*a);
				n = Math.max(a,b);
				count++;
			}
			System.out.println(count);
		}
	}
}