import java.util.Scanner;

public class Main {
	//受け取った配列を昇順にする
	private static void sortArray(int array[]) {
		int swap;
		for(int i = 0;i < array.length-1;i++) {
			for(int j = i;j < array.length;j++ ) {
				if(array[i] > array[j]) {
					swap = array[i];
					array[i] = array[j];
					array[j] = swap;
				}
			}
		}
	}

	//受け取った整数の桁数を返す
	private static int numDig(int p) {
		int digit = 1;
		int divide = 10;//貰った数を割り桁数を特定する
		while(true) {
			if(p/divide < 1)break;
			digit++;
			divide *= 10;
		}
		return digit;
	}

	/*県名(整数)と順番(整数)を受け取ると、認識番号の
	半分6桁を文字列で返す
	*/
	private static String
	halfId(int p){
		int digit = numDig(p);//桁数取得
		String zero = "";

		for(int i=0;i<(6-digit);i++) {
			zero += '0';
		}
		String firstId = zero + p;
		return firstId;
	}

    public static void main(String[] args) {
//    	入力例

//    	 N   M
//    	 2   7

//    	 P   Y  x
//    	 1  43  2
//    	 2  18  1
//    	 1  19  1
//    	 2  42  4
//    	 1  52  3
//    	 2  34  3
//    	 2  29  2
        Scanner scan = new Scanner(System.in);

        String Nstr = scan.next();
        String Mstr = scan.next();
        //N個の県があり、M個の市がある
        int N = Integer.parseInt(Nstr);
        int M = Integer.parseInt(Mstr);
        int[] P = new int[M];
        int[] Y = new int[M];
        String[] id = new String[M];

        for(int i = 0; i < M; i++) {
            String Pstr = scan.next();
            String Ystr = scan.next();
            P[i] = Integer.parseInt(Pstr);
            Y[i] = Integer.parseInt(Ystr);
        }
        //この時点でP配列とY配列は入力が終わっている

        int x = 1;//誕生した順番を示す
        int k = 0;//配列x専用の添え字
        int L = 0;//県の数を格納


    	for(int j = 1;j <= N; j++) {

    		for(int i = 0;i < M; i++) {
    			if(P[i] == j) {
    				L++;
    			}
    		}

            int[] Ysort = new int[L];
            L = 0;

    		for(int i = 0; i < M; i++) {
        		if(P[i] == j) {
        			Ysort[k] = Y[i];
        			k++;
        		}
        	}

    		k = 0;
    		sortArray(Ysort);
    		for(int i = 0; i < Ysort.length; i++) {
    			for(int l = 0; l < M; l++) {
    				if(Ysort[i] == Y[l]) {
    					id[l] = halfId(P[l])+halfId(x);
    					x++;
    				}
    			}
        	}
    		x = 1;
        }
    	for(int i=0;i<M;i++) {
    		System.out.println(id[i]);
    	}

    }
}