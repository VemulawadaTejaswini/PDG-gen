import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int max = 0;
			int min = 0;
			max = scanInt(scan);
			min = max;
			for(int i = 0;i < n-1;i++){
				int t = scanInt(scan);
				if(t > max){
					max = t;
				}else if(t < min){
					min = t;
				}
			}
			System.out.println(max + " " + min);
		}
	}
	
	public static int scanInt(Scanner scan){
		int t = 0;
		for(int i = 0;i < 5;i++){
			t += scan.nextInt();
		}
		return t;
	}
}