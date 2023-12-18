import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long a =  sc.nextLong();
	long b =  sc.nextLong();
	long c =  sc.nextLong();
	long k =  sc.nextLong();
	long sum = 0;

	if(a<=k) {
	for(int i=0;i<a;i++) {
		sum += 1;
	}
	for(int i=0;i<k-a-b;i++) {
		sum -= 1;
	}
	}

	System.out.println(sum);
    }
}