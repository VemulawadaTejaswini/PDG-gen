import java.math.BigInteger;
import java.util.Scanner;
class Main {
	int n;
	int[][] data;
	
	public static void main(String args[]){
		Main app = new Main();
		Scanner scan = new Scanner(System.in);
		
		while(true){
			app.n = scan.nextInt();
			if(app.n == 0){
				break;
			}
			app.data = new int[app.n][3];
			for(int i=0;i<app.n;i++){
				for(int j=0;j<3;j++){
					app.data[i][j] = scan.nextInt();
				}
			}
			app.exec();
		}
	}
	
	public void exec(){
		long total;
		boolean flag = true;
		
		for(int i=0;i<n;i++){
			total = data[i][1] * data[i][2];
			if(total >= 1000000){
				System.out.println(data[i][0]);
				flag = false;
			}
		}
		
		if(flag){
			System.out.println("NA");
		}
	}
}