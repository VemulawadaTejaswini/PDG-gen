import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int maxnum = sc.nextInt();
		int rest = sc.nextInt();
		
		int count = 0;
		for(int i=1; i<=maxnum;i++){
			for(int j=1;j<=maxnum;j++){
				if(i%j >= rest){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}