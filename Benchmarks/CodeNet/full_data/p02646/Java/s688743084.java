import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int v = sc.nextInt();
		int b = sc.nextInt();
		int w = sc.nextInt();
		int t = sc.nextInt();
		int flag = 0;
		for(int i=0; i<t; i++) {
			long onijo = a + v * i;
			long onika = a  - v* i ;
			long chiljo = b + w *i;
			long chilka = b - w *i;
			if(onijo>1000000000) {
				onijo=1000000000;
			}
			if(onika<-1000000000) {
				onika=-1000000000;
			}
			if(chiljo>1000000000) {
				chiljo=1000000000;
			}
			if(chilka<-1000000000) {
				chilka=-1000000000;
			}
			if(a<b) {
				if(chiljo<=onijo) {
					flag = 1;
					break;
				}
			}else {
					if(onika<=chilka) {
						System.out.println("YES");
					flag = 1;
			}
			}
		}

		if(flag==1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		
		
	}
	
}
