import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int A = scan.nextInt();
	int B = scan.nextInt();

	int count = 0;
	for(int i = 0; i < 2; i++){
	    if(A >= B){
		count += A;
		A--;
	    }else{
		count += B;
		B--;
	    }
	}

	System.out.println(count);
    }
}
