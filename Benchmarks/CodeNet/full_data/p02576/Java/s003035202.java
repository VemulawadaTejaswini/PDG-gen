import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int check = sc.nextInt();
			int tall = 0;
			long cnt = 0;
			
			
			for(int i=0;i<N-1;i++) {
				tall = sc.nextInt();
				if( tall<check) {
					cnt=cnt+(check-tall);
				}else {
					check=tall;
				}
			}
			
						
			System.out.println(cnt);
	}	
}