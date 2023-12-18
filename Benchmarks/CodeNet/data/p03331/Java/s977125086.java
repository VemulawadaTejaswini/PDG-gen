import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();

	int min = Integer.MAX_VALUE;

	for(int i = 1; i < N; i++){
	    int A = i;
	    int B = N-i;
	    int num = 0;
	    while(A > 0){
		num += A%10;
		A /= 10;
	    }
	    while(B > 0){
		num += B%10;
		B /= 10;
	    }

	    if(num < min){
		min = num;
	    }
	}

	System.out.println(min);
    }
}
