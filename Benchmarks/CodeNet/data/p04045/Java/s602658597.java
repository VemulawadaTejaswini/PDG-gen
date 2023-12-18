import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] d = new int[10];


		for(int i = 0;i < k;i++){
			d[sc.nextInt()]++;
		}


		for(int i = n;i <= 100000;i++){
			if(judge(i,d)){
				System.out.println(i);
				return;
			}
		}



	}
	static boolean judge(int num,int[] d){

		int keta = String.valueOf(num).length();
		int waru = (int)Math.pow(10, keta-1);
		for(int i = 0;i < keta;i++){
			int value = num/waru;
			if(d[value] > 0){
				return false;				//一つでもnumのなかに嫌な数値があったらfalse
			}
			num -= value*waru;				//桁を一つずつ落としていく
			waru /= 10;
		}
		return true;





	}
}