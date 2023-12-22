import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner stdIn = new Scanner(System.in);

		while(stdIn.hasNext()){
			int m = stdIn.nextInt();
			int n = stdIn.nextInt();
			int p = m;
			int s = 0;
			int t = 0;

			while(true){
				System.out.print(m*10/n);
				m = m*10%n;
				p = (p*10%n)*10%n;
				if(m==p){
					break;
				}
			}
			if(p!=0){
				p = 1;
				s = 1;
				while(m!=p){
					s++;
					m = m*10%n;
					p = p*10%n;
				}
				System.out.print(p*10/n);
				p = p*10%n;
				t = s;
				while(m!=p){
					t++;
					System.out.print(p*10/n);
					p = p*10%n;
				}
			}
			System.out.println();
			if(s!=0&&t!=0){
				for(int i=1;i<=t;i++){
					if(i>=s){
						System.out.print("^");
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}