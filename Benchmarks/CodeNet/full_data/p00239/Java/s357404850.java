import java.util.Scanner;



public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int kazu = sc.nextInt();//お菓子の数
			if(kazu == 0){
				break;
			}
			int[][] okasi = new int[kazu][4];
			for(int i=0;i<kazu;i++){
				okasi[i][0] = sc.nextInt();//お菓子の番号
				okasi[i][1] = sc.nextInt();//たんぱく質の重量
				okasi[i][2] = sc.nextInt();//資質の重量
				okasi[i][3] = sc.nextInt();//炭水化物の重量
			}
			int[] seigen = new int[4];
			for(int i=0;i<4;i++){
				seigen[i] = sc.nextInt();
			}
			int NAflg = 0;
			//制限を越えているか判定
			for(int i=0;i<kazu;i++){
				if(okasi[i][1] > seigen[0] |
				   okasi[i][2] > seigen[1] |
				   okasi[i][3] > seigen[2] |
				   (okasi[i][1] + okasi[i][3])* 4 + okasi[i][2] * 7 > seigen[3]
				  ){
					NAflg++;
					continue;
				}
				if(NAflg == kazu){
					System.out.println("NA");
				}else{
					System.out.println(okasi[i][0]);
				}
			}
			System.out.println();
		}
	}
}