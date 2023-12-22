import java.util.Scanner;
public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int i = 1;
		int n = s.nextInt();
		int x;
		int a = 0;
		x = i;
		while(a>=0){
			switch(a){
				case 0:
					a = -1;
					x = i;
					if(x % 3 == 0){
						System.out.print(" " + i);
						break;
					}
				case 1:
					if(a == 1){
						a = -1;
					}
					if(x % 10 == 3){
						System.out.print(" " + i);
						break;
					}
					x /= 10;
					if(x!=0){
						a = 1;
					}
			}
			i++;
			if(i <= n){
				a = 0;
			}
			
		}
		System.out.print("\n");
	}
	public static void main(String args[]){
		Main m = new Main();
		m.run();
	}
}