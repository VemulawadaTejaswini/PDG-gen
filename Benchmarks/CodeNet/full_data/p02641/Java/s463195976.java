import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();
		int N = scan.nextInt();
		int[] box = new int[N];
		int con=0;
		int min = X+100;
		int judge=0;
		int nbox;
		
		for(int i=0;i<N;i++) {
			box[i] = scan.nextInt();
			if(X==box[i]) {
				con=1;
			}
		}
		
		if(con==0) {
			System.out.print(X);
		}
		else {
			int acount=0;
			int bcount=0;
			for(int i=1;i<=100-X;i++) {
				if((X-i)<=min||(X+i)<=min) {
					int a = X-i;
					int b = X+i;
					for(int j=0;j<N;j++) {
						if(box[j] == a) {
							if(box[j] == b) {
								break;
							}
							else {
								bcount += 1;
							}
							break;
						}else{
							acount += 1;
						}
					}
					if(bcount==N) {
						min=b;
					}
					else if(acount==N) {
						min=a;
					}
				}
				
				
			}
			System.out.print(min);
		}



	}

}