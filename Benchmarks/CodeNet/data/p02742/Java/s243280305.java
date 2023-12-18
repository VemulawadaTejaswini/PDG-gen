import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long i, j;
		i = sc.nextLong();
		j = sc.nextLong();
		System.out.println(i*j/2+j*i%2);
	}
}