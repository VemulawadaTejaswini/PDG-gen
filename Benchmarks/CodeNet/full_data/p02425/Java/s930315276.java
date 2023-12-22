import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int bitArray[] = new int[64];

		for(int i = 0; i < q; i++) {
			boolean flag = false;
			switch(sc.nextInt()) {
			case 0:  //test->
				int flagNum = sc.nextInt();
				System.out.println(bitArray[flagNum]);
				break;

			case 1:  //set
				flagNum = sc.nextInt();
				if(bitArray[flagNum] == 0) bitArray[flagNum]++;
				//bitArray[i] = (bitArray[i] + 2) / 2;
				break;

			case 2:  //clear
				flagNum = sc.nextInt();
				if(bitArray[flagNum] == 1) bitArray[flagNum]--;
				//bitArray[i] /= 2;
				break;

			case 3:  //flip
				flagNum = sc.nextInt();
				bitArray[flagNum] = (bitArray[flagNum] + 1) % 2;
				break;

			case 4:  //all->全てのフラグがONになっている場合1、なっていない場合0を出力
				for(int j = 0; j < 64; j++) {
					if(bitArray[j] == 0) {
						flag = true;  //1つでもオフのフラグがあればtrueにする
						break;
					}
				}
				if(flag) System.out.println(0);
				else System.out.println(1);
				break;

			case 5:  //any->何れかのフラグがONになっている場合1、なっていない場合0を出力
				for(int j = 0; j < 64; j++) {
					if(bitArray[j] == 1) {
						flag = true;  //1つでもオンのフラグがあればtrueにする
						break;
					}
				}
				if(flag) System.out.println(1);
				else System.out.println(0);
				break;

			case 6:  //none->全てのフラグがOFFになっている場合1、なっていない場合0を出力
				for(int j = 0; j < 64; j++) {
					if(bitArray[j] == 1) {
						flag = true;  //1つでもオンのフラグがあればtrueにする
						break;
					}
				}
				if(flag) System.out.println(0);
				else System.out.println(1);
				break;

			case 7:  //count->
				int count = 0;
				for(int j = 0; j < 64; j++) {
					if(bitArray[j] == 1) count++;
				}
				System.out.println(count);
				break;

			case 8:  //val->
				/*
				BigDecimal state = new BigDecimal("");
				for(int j = 0; j < 64; j++) {
					if(bitArray[j] == 1) {
						state.add((int)Math.pow(2, j));  //ビット列のj桁目が1のときに2のj乗を加える
					}
				}
				*/
				long state = Long.MIN_VALUE;
				for(int j = 0; j < 64; j++) {
					if(bitArray[j] == 1) {
						state += (long)Math.pow(2, j); //ビット列のj桁目が1のときに2のj乗を加える
					}
				}
				if(state < 0) {
					System.out.println(state + Long.MAX_VALUE + 1);
					break;
				}
				else {
					System.out.println(Long.toUnsignedString(state + Long.MAX_VALUE + 2));
					break;
				}
			}
		}
	}

}
