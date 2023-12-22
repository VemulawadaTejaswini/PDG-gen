import java.util.Scanner;

public class Main {


	/**与えられた二つの行列の積を出力
	 *
	 * @param args
	 */
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){


		int gyo = scan.nextInt();
		int retu = scan.nextInt();		//vec_1:retu / vec_2:gyo
		int re_retu = scan.nextInt();

		//		int gyo = Integer.parseInt(args[0]);
		//		int retu = Integer.parseInt(args[1]);		//vec_1:retu / vec_2:gyo
		//		int re_retu = Integer.parseInt(args[2]);

		//		int output;
		long[][] vec_1 = new long[gyo][retu];			//一つ目の行列
		long[][] vec_2 = new long[retu][re_retu];		//２つ目の行列


		//入力→配列に収める

		for(int i = 0 ;i < gyo ;i++){
			for(int j = 0 ;j < retu ;j++){
				vec_1[i][j] = scan.nextLong();
				//vec_1[i][j] = Integer.parseInt(args[3 + (retu * i) + j]);
			}
		}
		for(int j=0;j<retu;j++){
			for(int k = 0 ;k < re_retu ;k++){
				vec_2[j][k] = scan.nextLong();
				//	vec_2[j][k] = Integer.parseInt(args[2 + (gyo * retu +1)+(re_retu * j) + k]);//2+6+1+3*j+k
			}
		}

		//配列→出力
		long[][] sum = new long[gyo][re_retu];

		for(int p = 0 ;p < gyo ;p++){
			for(int q = 0 ;q < re_retu ; q++){
				sum[p][q]=0;
				for(int k = 0 ; k < retu ;k++){
					sum[p][q] = sum[p][q] + vec_1[p][k]*vec_2[k][q];
				}
				if(q != re_retu-1){							//最後の列だけは空白をいれない
					System.out.print(sum[p][q]+" ");
				}else{
					System.out.print(sum[p][q]);
				}
			}
			System.out.println("");
		}
	}
}
