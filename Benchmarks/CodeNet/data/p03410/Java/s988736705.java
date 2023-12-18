import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	//変数宣言
	int N = scan.nextInt();
	int[] a = new int[N];
	int[] b = new int[N];
	int[][] c = new int[N][N];
	int[] ans_array = new int[27];
	
	//変数入力
	for(int i = 0; i < N; i++){
	    a[i] = scan.nextInt();
	}
	for(int i = 0; i < N; i++){
	    b[i] = scan.nextInt();
	}
	for(int i = 0; i < N; i++){
	    for(int j = 0; j < N; j++){
		c[i][j] = a[i]+b[j];
	    }
	}
	
	//2進数に変換したものをどんどん足していく
	for(int i = 0; i < N; i++){
	    for(int j = 0; j < N; j++){
		for(int k = 0; k < 27; k++){
		    ans_array[k] += c[i][j] % 2;
		    c[i][j] /= 2;
		    if(c[i][j] == 0){
			break;
		    }
		}
		for(int k = 0; k < 27; k++){
		}
	    }
	}
	
	int ans = 0;
	for(int i = 0; i < 27; i++){
	    if(ans_array[i] % 2 == 0){
		ans_array[i] =0;
	    }else{
		ans_array[i] = 1;
		ans += pow(2, i);
	    }
	}
	
	System.out.println(ans);
    }

    public static int pow(int s, int t){
	s = 1;
	for(int i = 0; i < t; i++){
	    s *= 2;
	}
	return s;
    }
}
