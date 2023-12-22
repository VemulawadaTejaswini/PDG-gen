import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int[][][] arr = new int[4][3][10];//??????[?£?][???][??¨?±?]
//??¨?±?????????°????????????
		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				for(int k=0; k<10; k++){
					arr[i][j][k] = 0;
				}
			}
		}
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
//??\?????????
		for(int i=0; i<n; i++){
			int b = scan.nextInt()-1;
			int f = scan.nextInt()-1;
			int r = scan.nextInt()-1;
			int v = scan.nextInt();
			arr[b][f][r] += v;
		}
		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				for(int k=0; k<10; k++){
					System.out.print(" " + arr[i][j][k]);
				}
			}
			if(i!=3) {
				System.out.println("####################");
				}
		}
	}
}