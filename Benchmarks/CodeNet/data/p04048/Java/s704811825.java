import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // the number of cells on the Y axis
        int X = in.nextInt(); // the number of cells on the Y axis
        int L = 0;
        //場合分け
        if(N/2 == X && (N % 2 == 0)){
        	L = X *3;
        }else if(X < N-X){
        	L = N + X;
        	L += (X / (N-(2* X))) * 3 *(N-(2* X)) - (N-(2* X));
        }else if(N/2 > X ){
        	L = cal(N,X);
        }else if(N/2 < X){
        	L = cal(N,N -X);
        }
 
        System.out.println(L);
	}
	static int cal (int N,int X){
		int L = 0;
    	L = N + X;
		L += (N-X)/X * 2 -X * 2;
		return L;
	}
 
}