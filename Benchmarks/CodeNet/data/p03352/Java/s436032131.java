import java.util.Scanner;

class Main{
	public static void main(String args[]){
		int x, a, b, c;
		int n = 1;
		c = 1;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if(x == 1){
			System.out.print(1);
			return;
		}
		for(int i = 2; i <= 32; i++){
			b = i;
          	c = i;
			while(c * b <= x){
              c *= b;
			  if(n <= c){
				  n = c;
			  }
			}
		}
		System.out.print(n);
	}
}
