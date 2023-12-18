import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	boolean[] can = new boolean[N];//N枚のカード
	for(int i=0;i<N;i++) can[i]=true;
	
	for(int i=0;i<M;i++){//M個のゲートについてしらべる
	    int L = sc.nextInt();
	    int R = sc.nextInt();
	    for(int j=0;j<N;j++){
		if(! (L-1<=j && j<=R-1) ){
		    can[j]=false;
		}
	    }
	}
	int count=0;
	for(int i=0;i<N;i++){
	    if(can[i]==true) count++;
	}
	System.out.print(count);
    }
}
