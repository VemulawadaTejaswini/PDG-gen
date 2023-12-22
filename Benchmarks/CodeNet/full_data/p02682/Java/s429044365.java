import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	int C = sc.nextInt();
	int K = sc.nextInt();
	int count=0;

	if(K>=A){
	    count = A;
	    K -= A;
	}else{
	    count = K;
	    K = 0;
	}
	if(K>0){
	    if(K>=B){
		K -= B;
	    }else{
		K = 0;
	    }
	}
	if(K>0){
	    count -= K;
	}
	System.out.print(count);
    }
}
