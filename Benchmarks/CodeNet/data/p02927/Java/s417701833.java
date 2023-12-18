import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int M =sc.nextInt();
		int D =sc.nextInt();
		int count=0;
		for(int i=1;i<=M;i++) {
			
			for(int j=22;j<=D;j++) {
				int s1=j%10;
				int s2 =j/10;
				if(s1>=2 && s2>=2 && s1*s2 == i) {
					count++;
					
				}
				
			}
		}
		System.out.println(count);
		  
	}
}