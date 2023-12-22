import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		new Main().run();
	}

	void run(){
		Scanner sc =  new Scanner(System.in);
		int c = 0;
		while(true){
			if(!sc.hasNext()){
				break;
			}

			int a = sc.nextInt();
			int[] b = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
			solve(a,b,b.length-1);
		}
	}

	void solve(int a, int[] b, int i){
		if(a >= b[i] && a != 0){
			a -= b[i];
			if(b[i] != 1){
				System.out.print(b[i]+" ");
			}else{
				System.out.println(b[i]);
			}
		}
		if(i != 0){
			solve(a, b, --i);
		}
	}
}