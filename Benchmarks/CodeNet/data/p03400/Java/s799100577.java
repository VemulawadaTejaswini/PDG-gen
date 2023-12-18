import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();
	int D = scan.nextInt();
	int X = scan.nextInt();
	int[] A_ = new int[N];
	
	for(int i = 0; i < N; i++){
	    A_[i] = scan.nextInt();
	}

	int sum = 0;
	for(int i = 0; i < N; i++){
	    int count = 0;
	    for(int j = 1; count <= D; j++){
		sum += 1;
		count = (1 + A_[i]*j);
	    }
	}

	System.out.println(sum+X);
    }
}
