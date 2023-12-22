
import java.util.Scanner;

public class Main{ 
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			
			while(sc.hasNext()) {
				int h = sc.nextInt();
				int w = sc.nextInt();
				if(h+w==0)break;
				
				int taikaku = h*h+w*w;
				int minta = 50000;
				int ansh = 0;
				int answ = 0;
				
				for(int i=1;i<150;i++) {
					for(int j=i+1;j<=150;j++) {
						if(i==h&&w==j)continue;
						int t = i*i+j*j;
						if(t>=taikaku) {
							if(t==taikaku) {
								if(ansh>h) {
									ansh = i;
									answ = j;
								}
							}
							else if(minta>t) {
								minta = t;
								ansh = i;
								answ = j;
							}
							else if(minta==t) {
								if(ansh>h) {
									ansh = i;
									answ = j;
								}
							}
						}
					}
				}
				System.out.println(ansh +" "+answ);
			}
		}
	}
}

