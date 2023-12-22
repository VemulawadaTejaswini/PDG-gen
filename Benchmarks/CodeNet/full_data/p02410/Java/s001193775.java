import java.util.Scanner;

public class Main{


	/**
	 * 与えられたベクトルの積を求める
	 * @param args　vec_1,vec_2
	 */
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){

		int gyo = scan.nextInt();
		int retu = scan.nextInt();
		//		int gyo = Integer.parseInt(args[0]);
		//		int retu = Integer.parseInt(args[1]);


		int[][] vec_1 = new int[gyo][retu];

		//int[] output = new[vec_1];
		//vec_1
		for(int i= 0; i<gyo;i++){
			for(int j= 0;j<retu;j++ ){
				vec_1[i][j] = scan.nextInt();
				//		vec_1[i][j] = Integer.parseInt(args[4*i+(j+2)]);
				//		System.out.print(vec_1[i][j]+" ");
			}
			//	System.out.println("");
		}

		//vec_2
		int[] vec_2 = new int[retu];
		for(int i = 0; i < retu;i++){
			vec_2[i] = scan.nextInt();
			//	vec_2[i] = Integer.parseInt(args[gyo*retu+2+i]);
			//	System.out.println(vec_2[i]);
		}

		//output
		int[] output = new int[gyo];
		for(int i = 0;i< gyo;i++){
			for(int j= 0;j<retu; j++){
				output[i] =output[i] +  vec_1[i][j]*vec_2[j];
			}
			System.out.println(output[i]);
		}

	}
}
