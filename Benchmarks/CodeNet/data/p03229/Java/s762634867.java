import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	int N;   //整数の個数
	N = scan.nextInt();

	long max1 = 0;
	long max2 = 0;
	long sum = 0;

	int[] A = new int[N];   //整数
	for(int i = 0; i < N; i++){
	    A[i] = scan.nextInt();
	}

	//昇順ソート
	Arrays.sort(A);

	//整数が偶数個の場合
	if(A.length % 2 == 0){
	    for(int i = 0; i < (N/2) ; i++){
		if(i == (N/2-1)){
		    sum -= A[i];
		}else{
		    sum -= (A[i]*2);
		}
		System.out.println(i + " : " + sum);
	    }
	    for(int i = (N/2); i < N; i++){
		if(i == (N/2)){
		    sum += A[i];
		}else{
		    sum += (A[i]*2);
		}
		System.out.println(i + " : " + sum);
	    }
	}

	//整数が奇数個の場合
	if(A.length % 2 != 0){
	    //M字型
	    for(int i = 0; i <= (N/2); i++){
		if(i == (N/2-1) || i == (N/2)){
		    max1 -= A[i];
		}else{
		    max1 -= (A[i]*2);
		}
	    }
	    for(int i = (N/2+1); i < N; i++){
		max1 += (A[i]*2);
	    }
	    
	    //W字型
	    for(int i = 0; i < (N/2); i++){
		max2 -= (A[i]*2);
	    }
	    for(int i = (N/2); i < N; i++){
		if(i == (N/2) || i == (N/2+1)){
		    max2 += A[i];
		}else{
		    max2 += (A[i] * 2);
		}
	    }

	    //大きい方を評価
	    sum = Math.max(max1, max2);
	}

	System.out.println(sum);
    }
}
