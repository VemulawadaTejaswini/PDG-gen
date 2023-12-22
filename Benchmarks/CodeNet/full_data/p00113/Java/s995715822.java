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
			int tmpP = m;

			while(true){
				m = m*10%n;
				p = (p*10%n)*10%n;
				if(m==p){
					break;
				}
			}
			if(p!=0){
				if(m==tmpP){
					s = 1;
					t = 1;
				}
				else{
					p = 1;
					s = 1;
					while(m!=p){
						s++;
						m = m*10%n;
						p = p*10%n;
					}
					p = p*10%n;
					t = s;
					while(m!=p){
						t++;
						p = p*10%n;
					}
				}
			}
			if(s==0&&t==0){
				System.out.printf("%s\n", String.valueOf(tmpP*1.0/n).substring(2));
			}
			else{
				for(int i=0;i<t;i++){
					System.out.print(tmpP*10/n);
					tmpP = tmpP*10%n;
				}
				System.out.println();
			}
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