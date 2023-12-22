import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int cnt = 0;
		for(int a=0;a<=1000;a++){
			for(int b=0;b<=1000;b++){
				for(int c=0;c<=1000;c++){
					int d = n-a-b-c;
					if(d>=0&&d<=1000){
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}