import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
        int result=0;
        for(int i=0;i<2;i++) {
			result += Math.max(A,B);
            if(result == A) A--;
            else B--;
		}
    	System.out.println(result);
	}
}