import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a+b==60 && c>30){
			System.out.println(-1);
			return;
		}
			
		for(int i=0;;i++){
			int j=0;
			for(;;j++){
				int d = c+60*j;
				int e = (a+b)*i;
				if(e < d && d<=e+a){
					System.out.println(d);
					return;
				}else if(e+a < d){
					break;
				}
			}
		}
	}
}