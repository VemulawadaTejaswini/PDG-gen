import java.util.Scanner;

class Effic{
	double ef;
	int ind;
}

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int X = scan.nextInt();
		int ref[][] = new int[N+1][M+2];

		Effic[] param = new Effic[N];

		for(int ct1 = 0; ct1 < N; ct1++){
			param[ct1] = new Effic();
		}

		for(int ct1 = 0; ct1 < N; ct1++){
			for(int ct2 = 0; ct2 < M+1; ct2++){
				ref[ct1][ct2] = scan.nextInt();
				ref[N][ct2] += ref[ct1][ct2];
				ref[ct1][M+1] += ref[ct1][ct2];
			}
			param[ct1].ef = (ref[ct1][M+1] - ref[ct1][0]) / (double)(ref[ct1][0] / 100);
			param[ct1].ind = ct1;
		}

		scan.close();

		boolean flag = false;

		for(int ct1 = 1; ct1 < M+1; ct1++){
			if(ref[N][ct1] < X){
				flag = true;
			}
		}

		if(flag == true){
			System.out.println("-1");
			System.exit(-1);
		}

		Effic yop = new Effic();

		for(int ct1 = N-1; ct1 >= 0; ct1--){
			for(int ct2 = 0; ct2 < N-1; ct2++){
				if(param[ct2].ef > param[ct2+1].ef){
					yop = param[ct2+1];
					param[ct2+1] = param[ct2];
					param[ct2] = yop;
				}
			}
		}

		int dt[] = new int[M+1];
		for(int count = 0; count < N; count++){
			flag = true;
			dt = ref[N].clone();
			for(int ct1 = 0; ct1 < M+1; ct1++){
				dt[ct1] -= ref[param[count].ind][ct1];
			}

			for(int ct1 = 1; ct1 < M+1; ct1++){
				if(dt[ct1] < X){
					flag = false;
				}
			}

			if(flag){
				ref[N] = dt;
			}
		}

		System.out.println(ref[N][0]);
	}
}