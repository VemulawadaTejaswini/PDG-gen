import java.util.Scanner;

//Winter Bells
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
			if((n|m|p)==0)break;
			for(int i=0;i<m;i++){
				sc.nextInt(); sc.nextInt(); sc.nextInt();
			}
			for(int i=0;i<p;i++){
				sc.nextInt();
				System.out.printf("%.8f\n", 0);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}