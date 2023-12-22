import java.util.Scanner;


public class Main {

	private void doit() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int q1 = sc.nextInt();
			if(q1 == 0){
				break;
			}
			int b = sc.nextInt();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int q2 = sc.nextInt();
			boolean flg = false;
			for(int i = q2; i > 0; i--){
				if( (b - i * c1) < 0) continue;
				int j = (b - i * c1) / c2;
				if(j < 0) continue;
				if(i + j >= q1){
					System.out.println(i + " " + j);
					flg = true;
					break;
				}
			}
			if(! flg){
				System.out.println("NA");
			}
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();

	}

}