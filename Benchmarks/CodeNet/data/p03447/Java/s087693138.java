import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int X = scan.nextInt();
	int A = scan.nextInt();
	int B = scan.nextInt();

	int sum = X - A;

	for(int i = 0; sum >= B; i++){
	    sum -= B;
	}
	System.out.println(sum);
    }
    
}
