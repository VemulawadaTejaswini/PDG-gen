import java.util.Scanner;

//C問題
public class Main {
	public static void main(String[] args) {

		//レートで区分をわける
		//
		int rate[] = new int[10];

		//配列を0で初期化
		for(int cnt = 0;cnt < 10; cnt++) {
			rate[cnt] = 0;
		}

		//スキャナーを宣言する
	    Scanner sc = new Scanner(System.in);

	    //入力を受け取る
	    int N = Integer.parseInt(sc.next());
	    int a;

	    for(int cnt = 0; cnt < N; cnt++) {
	    	a = Integer.parseInt(sc.next());
	    	//レートで区分分け
	    	if((1 <= a)&&(a <= 399)){
	    		rate[0] = 1;
	    	}
	    	else if((400 <= a)&&(a <= 799)){
	    		rate[1] = 1;
	    	}
	    	else if((800 <= a)&&(a <= 1199)){
	    		rate[2] = 1;
	    	}
	    	else if((1200 <= a)&&(a <= 1599)){
	    		rate[3] = 1;
	    	}
	    	else if((1600 <= a)&&(a <= 1999)){
	    		rate[4] = 1;
	    	}
	    	else if((2000 <= a)&&(a <= 2399)){
	    		rate[5] = 1;
	    	}
	    	else if((2400 <= a)&&(a <= 2799)){
	    		rate[6] = 1;
	    	}
	    	else if((2800 <= a)&&(a <= 3199)){
	    		rate[7] = 1;
	    	}
	    	else if((3200 <= a)&&(a <= 4800)){
	    		rate[8] = rate[8] + 1;
	    	}
	    }

	    //スキャナーを閉じる
	    sc.close();
	    //色の合計
	    int sum = 0;

	    for (int cnt = 0;cnt < 10; cnt++) {
	    	sum = sum + rate[cnt];
	    }

	    //出力
	    //最小値
	    if((sum-rate[8]) == 0) {
	    	//sumが0の時
	    	System.out.print((sum-rate[8] + 1));
	    }
	    else {
	    	System.out.print((sum-rate[8]));
	    }

	    //最大値
	    System.out.print(" "+sum);
	}
}
