import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int count = 0;
			for(int a = 0;a < n+1 && a <= 1000;a++){
				int sumA = a;
				for(int b = 0;b < n+1 && b <= 1000;b++){
					int sumB = sumA + b;
					for(int c = 0;c < n+1 && c <= 1000;c++){
						int sumC = sumB + c;
						for(int d = 0;d < n+1 && d <= 1000;d++){
							if(sumC + d == n){
								count++;
								break;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}