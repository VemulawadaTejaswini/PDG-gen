import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        int AB = A + B;
        int num = N / AB;
        int amari = N % AB;

        int sum = num * A;
        if(amari >= A)
            sum += A;
        else    
            sum += amari;
        System.out.println(sum);
    }

}
