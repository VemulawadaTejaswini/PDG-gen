import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();
	int[] A_ = new int[N];
	int[] B_ = new int[N+1];
	int[] money_ = new int[N];

	for(int i = 0; i < N; i++){
	    A_[i] = scan.nextInt();
	}

	int flag = 0;
	for(int i = 0; i < N+1; i++){
	    if(i == N){
		B_[i] = A_[i-1];
	    }else{
		B_[i] = flag-A_[i];
		flag = A_[i];
	    }
	}

	for(int i = 0; i < N; i++){
	    for(int j = 0; j < N+1; j++){
		if(i == j){
		    money_[i] += Math.abs(B_[j]+B_[j+1]);
		    j++;
		}else{
		    money_[i] += Math.abs(B_[j]);
		}
	    }
	}

	for(int i = 0; i < N; i++){
	    System.out.println(money_[i]);
	}
    }
}
