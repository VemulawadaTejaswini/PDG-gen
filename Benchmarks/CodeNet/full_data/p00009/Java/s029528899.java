import java.util.Scanner;

public class Main {
	
	static boolean[] num=new boolean[1000000];
	
	static void prime(int n) {
		for(int i=2; i*n<1000000; i++) {
			num[n*i]=false;
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				for(int i=2; i<1000000; i++) {
					num[i]=true;
				}
				for(int i=2; i<1000000; i++) {
					if(num[i]) {
						prime(i);
					}
				}
				int n=sc.nextInt();
				int count=0;
				for(int i=n; i>1; i--) {
					if(num[i]) {
						count++;
					}
				}
				System.out.println(count);
			}
			
		}
	}
}
