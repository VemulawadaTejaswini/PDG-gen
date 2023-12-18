import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();
	int[] A_ = new int[N];
	int[] money = new int[N];

	for(int i = 0; i < N; i++){
	    A_[i] = scan.nextInt();
	}

	for(int i = 0; i < N; i++){
	    int flag = 0;
	    int tmp = 0;
	    for(int j = 0; j < N; j++){
		tmp = j;
		if(j != i){
		    money[i] += Math.abs(flag - A_[j]);
		    flag = A_[j];
		}else{
		    if(j == N-1){
			tmp = j-1;
		    }
		}
	    }
	    money[i] += Math.abs(A_[tmp]);
	}
    
	
	for(int i = 0; i < N; i++){
	    System.out.println(money[i]);
	}
    }
}
