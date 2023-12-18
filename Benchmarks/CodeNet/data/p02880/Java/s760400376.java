import java.util.Scanner;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
      	int i;	
      
		for (i = 1; i < 10; i++) {
        	if (N % i == 0 && N / i < 10) {
            System.out.print("Yes");
            return;
            }
        }
	System.out.print("No");
	return;

	}
}